package aliboung.demo.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@SuperBuilder
public class Lecture extends BaseEntity{

//    @Id
//    @GeneratedValue
//    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name="section_id")
    private Section section;

    @OneToOne
    @JoinColumn(name = "resourse_id")
    private Resourse resourse;


}
