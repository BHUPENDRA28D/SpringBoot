package UberReviewServices.UberReviewServices.repositories;

import UberReviewServices.UberReviewServices.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepositry extends JpaRepository<Booking,Long> {
}
