package UberReviewServices.UberReviewServices.models.PractiseManyToMany;

import UberReviewServices.UberReviewServices.models.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course extends BaseModel {

    private  String name;

    @ManyToMany
    private List<Student> student = new ArrayList<>();
}
