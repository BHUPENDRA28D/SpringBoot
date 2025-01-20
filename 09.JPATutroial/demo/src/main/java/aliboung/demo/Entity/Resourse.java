package aliboung.demo.Entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;


@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "resource_type") --->Only need with single table stratergy in inheritance...
public class Resourse {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String size;
    private String url;

    @OneToOne
    @JoinColumn(name= "lecture_id")
    private Lecture lecture;
}
