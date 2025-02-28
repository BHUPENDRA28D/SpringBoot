package UberReviewServices.UberReviewServices.controller;

import UberReviewServices.UberReviewServices.ResponseByAPI.ApiErrorResponse;
import UberReviewServices.UberReviewServices.adapters.CreateReviewDtoToReviewAdapter;
import UberReviewServices.UberReviewServices.dtos.CreateReviewDto;
import UberReviewServices.UberReviewServices.models.Review;
import UberReviewServices.UberReviewServices.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @Autowired
    private ApiErrorResponse apiErrorResponse; //Composition.

    @Autowired
    private CreateReviewDtoToReviewAdapter createReviewDtoToReviewAdapter;


/*    @GetMapping
    public ResponseEntity<?> getAllReviews() {

        List<Review> reviewList = this.reviewService.findAllReviews();

        if(reviewList.isEmpty()){
            apiErrorResponse.setCode(404);
            apiErrorResponse.setMessage("No review found!");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiErrorResponse);
        }

        return ResponseEntity.ok(Map.of(
                "status",200,
                "message","Showing All Reviews",
                "data",reviewList
        ));

    }*/





    @PostMapping
    public ResponseEntity<?> publishReview(@Validated @RequestBody CreateReviewDto request){
        Review incomingReview = this.createReviewDtoToReviewAdapter.convertDto(request);
        if(incomingReview == null){
            return new   ResponseEntity<>("Invalid Arguments",HttpStatus.BAD_REQUEST);
        }

        Review review = this.reviewService.publishReview(incomingReview);

        return new ResponseEntity<>(review,HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<Review>> getAllReviews(){
        List<Review> reviews = this.reviewService.findAllReviews();
        return new ResponseEntity<>(reviews, HttpStatus.OK);
    }

    @GetMapping("/{reviewId}")
    public ResponseEntity<?> findReviewById(@PathVariable Long reviewId) {
        try {
            Optional<Review> review = this.reviewService.findReviewById(reviewId);
            return new ResponseEntity<>(review, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{reviewId}")
    public ResponseEntity<?> deleteReviewById(@PathVariable Long reviewId) {
        try {
            boolean isDeleted = this.reviewService.deleteReviewById(reviewId);
            if(!isDeleted) return new ResponseEntity<>("Unable to delete Review", HttpStatus.INTERNAL_SERVER_ERROR);
            return new ResponseEntity<>("Review deleted successfully", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{reviewId}")
    public ResponseEntity<?> updateReview(@PathVariable Long reviewId, @RequestBody Review request){
        try {
            Review review = this.reviewService.updateReview(reviewId, request);
            return new ResponseEntity<>(review, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
