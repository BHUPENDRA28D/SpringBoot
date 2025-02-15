package UberReviewServices.UberReviewServices.services;

import UberReviewServices.UberReviewServices.models.Booking;
import UberReviewServices.UberReviewServices.models.Review;
import UberReviewServices.UberReviewServices.repositories.BookingRepositry;
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

    @Autowired
    private BookingRepositry bookingRepository;



    @Override
    public void run(String... args) throws Exception {
        System.out.println("*************");

        Review r = Review.builder()
                .content("Amazing ride quality")
                .rating(4.0)
                .build();

        Booking b = Booking.builder()
                .review(r)
                .endTime(new Date())
                .build();

        r.setBooking(b); // Ensure Review has a reference to Booking

        bookingRepository.save(b); // This will save both Booking and Review

        System.out.println(r);

        List<Review> reviewList = reviewRepository.findAll();
        for (Review review : reviewList) {
            System.out.println(review.getContent());
        }
    }



}
