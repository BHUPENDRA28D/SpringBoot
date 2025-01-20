package aliboung.demo.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Entity
public class Section extends BaseEntity {

//
//    @Id
//    @GeneratedValue
//    private Integer id;
    private String name;
    private String sectionOrder;


    @ManyToOne
    @JoinColumn(name="course_id")
    private Course course;


    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;

}
