package UberReviewServices.UberReviewServices.services;

import UberReviewServices.UberReviewServices.models.Booking;
import UberReviewServices.UberReviewServices.models.Driver;
import UberReviewServices.UberReviewServices.models.Review;
import UberReviewServices.UberReviewServices.repositories.BookingRepositry;
import UberReviewServices.UberReviewServices.repositories.DriverRepository;
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
    @Autowired
    private DriverRepository driverRepository;




    @Override
    public void run(String... args) throws Exception {
        System.out.println("*************");




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


        /*  Optional<Booking> b = bookingRepositry.findById(4L);
        if(b.isPresent()){
            bookingRepositry.delete(b.get());
        }*/




//      List<Driver> drivers = driverRepository.findAll();


      /*  Optional<Driver> driver = driverRepository.findByIdAndLicenseNumber(1L,"DL7761");
        if(driver.isPresent()){
            System.out.println(driver.get().getName());
        }*/


        Optional<Driver> driver = driverRepository.findById(1L);
        if(driver.isPresent()){
            System.out.println(driver.get().getName());
          List<Booking> b=   driver.get().getBookings();

          for(Booking booking :b){
            System.out.println(booking.getId());}
        }

//
//       Optional<Booking>  b = bookingRepositry.findById(1L);
//        if(b.isPresent()){
//            System.out.println(b.get().getBookingStatus());
//        }
    }




}
