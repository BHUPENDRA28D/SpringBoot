package UberReviewServices.UberReviewServices.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor
public class CustomDriver {

    Long id;
    String name;

    public CustomDriver(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
