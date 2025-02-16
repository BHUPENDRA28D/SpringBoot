package UberReviewServices.UberReviewServices.models.PractiseManyToMany;

import UberReviewServices.UberReviewServices.models.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student extends BaseModel {

    private String name;

    private String rollNo;


    @ManyToMany
    @JoinTable(name ="course_student",

            joinColumns = @JoinColumn(name ="student_id")
            ,inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses = new ArrayList<>();
}
