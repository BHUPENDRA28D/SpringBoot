package UberReviewServices.UberReviewServices.repositories;

import UberReviewServices.UberReviewServices.models.Review;
import jakarta.persistence.Id;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

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

}
