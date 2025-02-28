package UberReviewServices.UberReviewServices.services;

import UberReviewServices.UberReviewServices.models.Review;
import UberReviewServices.UberReviewServices.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class ReviewServiceImpl implements   ReviewService{


    @Autowired
    private ReviewRepository reviewRepository;




    @Override
    public List<Review> findAllReviews() {
        return this.reviewRepository.findAll();
    }

    @Override
    public Optional<Review> findReviewById(Long id) {
        return Optional.empty();
    }



    @Override
    public boolean deleteReviewById(Long id) {
        return false;
    }

    @Override
    public Review publishReview(Review review) {
        return null;
    }

    @Override
    public Review updateReview(Long id, Review review) {
        return null;
    }

}
