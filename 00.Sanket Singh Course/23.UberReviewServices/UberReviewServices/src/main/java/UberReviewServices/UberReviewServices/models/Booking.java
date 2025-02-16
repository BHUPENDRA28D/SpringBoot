package UberReviewServices.UberReviewServices.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.spi.CascadeStyle;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Booking extends BaseModel{

    //some composition we are trying to associate the entiy by composition.
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
   private Review review;  // defined a 1:1 relation btwn Booking and review;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(TemporalType.DATE)
    private Date endTime;


    private Long totalDistance;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;
}
