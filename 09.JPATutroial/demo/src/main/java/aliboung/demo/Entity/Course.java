package aliboung.demo.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Course extends BaseEntity {

//    @Id
//    @GeneratedValue
//    private  Integer id;

    private String title;
    private String description;

// many 2 many Relation and owner of the relation here is(course).

    @ManyToMany
    @JoinTable(
            name="authors courses",
            joinColumns = {
                    @JoinColumn(name="course_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "author_id")
            }

    )
    private List<Author> authors;

    @OneToMany(mappedBy = "course")
    private List<Section> sections;

}
