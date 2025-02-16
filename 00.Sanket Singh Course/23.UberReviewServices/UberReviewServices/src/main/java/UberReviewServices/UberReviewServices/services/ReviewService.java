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
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private BookingRepositry bookingRepositry;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("*************");

        Optional<Booking> b = bookingRepositry.findById(4L);
        if(b.isPresent()){
            bookingRepositry.delete(b.get());
        }


      /*  Review r = Review.builder()
                .content("Amazing ride quality")
                .rating(4.0)
                .build();

        Booking b = Booking.builder()
                .review(r)
                .endTime(new Date())
                .build();


//        reviewRepository.save(r); // this code create sql query.
        bookingRepositry.save(b);
        System.out.println(r);

        List<Review> reviewList = reviewRepository.findAll();
        for (Review review : reviewList) {
            System.out.println(review.getContent());
        }*/



    }



}
