package UberReviewServices.UberReviewServices.services;

import UberReviewServices.UberReviewServices.models.Booking;
import UberReviewServices.UberReviewServices.models.CustomDriver;
import UberReviewServices.UberReviewServices.models.Driver;
import UberReviewServices.UberReviewServices.models.Review;
import UberReviewServices.UberReviewServices.repositories.BookingRepositry;
import UberReviewServices.UberReviewServices.repositories.DriverRepository;
import UberReviewServices.UberReviewServices.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.*;

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


 /*       Optional<Driver> driver = driverRepository.findById(1L);
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
//        }*/


//        Optional<Driver> d = driverRepository.rawFindByIdAndLicenseNumber(2L,"MP04SN9987");
//        System.out.println(d.get().getName());

//    CustomDriver d = driverRepository.hqlFindByIdAndLicense(1L,"DL7761");
//    System.out.println(d.get().getName());




        List<Long> driver_ids = new ArrayList<>(Arrays.asList(1L,2L));
        List<Driver> drivers= driverRepository.findAllByIdIn(driver_ids);
//        List<Booking> bookings = bookingRepositry.findAllByDriverIn(drivers);

        for(Driver driver :drivers){  // this creates N+1 problem!
            Set<Booking> bookings = driver.getBookings();
            bookings.forEach(booking -> System.out.println(booking.getId()));
        }

    }





}
