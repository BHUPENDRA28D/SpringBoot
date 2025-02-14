package UberReviewServices.UberReviewServices.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "driver_id")

public class DriverReview extends Review{

    private String driverComment;
}
