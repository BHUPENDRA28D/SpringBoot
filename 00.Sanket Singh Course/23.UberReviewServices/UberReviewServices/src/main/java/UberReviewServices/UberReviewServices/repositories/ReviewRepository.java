package UberReviewServices.UberReviewServices.repositories;

import UberReviewServices.UberReviewServices.models.Review;
import jakarta.persistence.Id;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long > {
/*Class ComandlineRunner.
    @Override

   public void run(String... args) throws Exception {
        System.out.println("**************\n***********\n**********");

        Review r = Review.builder()
                .content("Amazing quality of ride")
                .rating(4.5)
                .build();
    }*/



    Integer countAllByRatingIsLessThanEqual(Integer givenRating);

    List<Review> findAllByRatingIsLessThanEqual(Integer givenRating);

    List<Review> findAllByCreatedAtBefore(Date date);

    @Query("select r from Booking b inner join Review r where b.id = :bookingId")
    Review findReviewByBookingId(Long bookingId);

}
