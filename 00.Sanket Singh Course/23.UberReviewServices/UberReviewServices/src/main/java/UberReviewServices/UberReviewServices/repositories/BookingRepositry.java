package UberReviewServices.UberReviewServices.repositories;

import UberReviewServices.UberReviewServices.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepositry extends JpaRepository<Booking,Long> {
}
