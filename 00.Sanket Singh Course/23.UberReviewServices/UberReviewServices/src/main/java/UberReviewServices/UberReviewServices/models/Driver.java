package UberReviewServices.UberReviewServices.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Driver extends  BaseModel {

    private  String name;

    @Column(nullable = false,unique = true)
    private String licenseNumber;



    // 1:m ,Driver :Booking..\

    @OneToMany(mappedBy = "driver",fetch = FetchType.EAGER)
    private List<Booking> bookings = new ArrayList<>();

}
