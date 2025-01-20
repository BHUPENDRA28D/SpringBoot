package aliboung.demo.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
//@Table(name = "AUTHOR_TBL")
@SuperBuilder
public class Author extends BaseEntity{

    //to tell springdata jpa that id is primary key we use @Id annotation
 //   @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
  /*   @GeneratedValue(
            strategy = GenerationType.TABLE,
            generator = "author_id_gen"
              )
   @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1

    )*/
   /* @TableGenerator(
            name = "author_id_gen",
            table = "id_genrator",
            pkColumnName = "id_name",
            valueColumnName = "id_value",
            allocationSize = 1
    )*/
 //   private Integer id=null;   // when hebernate see Interger it will auto generte id
    private String firstName;
    private String lastName;

    @Column(unique = true,
            nullable = false
    )
    private String email;
    private int age;
//    @Column(
//            updatable = false,
//            nullable = false
//
//    )
//    private LocalDateTime createdAt;
//    @Column(
//            insertable = false
//    )
//    private LocalDateTime lastModified;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

}
