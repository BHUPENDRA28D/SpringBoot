package UberReviewServices.UberReviewServices.services;

import UberReviewServices.UberReviewServices.models.Review;
import UberReviewServices.UberReviewServices.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {

    @Autowired
    private ReviewRepository reviewRepository;

    public void run(String... args) throws Exception {
        System.out.println("**************\n***********\n**********");

        //code to crate plane java object.
        Review r = Review.builder().content("Amazing quality of ride")
                .rating(4.5).build();
        System.out.println(r.toString());
        reviewRepository.save(r); //this code executes sql queries.


        List<Review> reviewList = reviewRepository.findAll();
        for(Review review: reviewList){
            System.out.println(r.getContent());
        }
    }
}