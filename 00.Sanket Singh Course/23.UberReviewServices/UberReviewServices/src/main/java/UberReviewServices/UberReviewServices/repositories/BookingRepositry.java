package UberReviewServices.UberReviewServices.repositories;

import UberReviewServices.UberReviewServices.models.Booking;
import UberReviewServices.UberReviewServices.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepositry extends JpaRepository<Booking,Long> {

    List<Booking> findAllByDriverId(Long driverId);

    List<Booking> findAllByDriverIn(List<Driver> drivers);
}
