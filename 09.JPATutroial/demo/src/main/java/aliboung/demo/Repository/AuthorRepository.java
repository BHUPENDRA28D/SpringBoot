package aliboung.demo.Repository;

import aliboung.demo.Entity.Author;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Integer> {

    //update Author a set a.age =22 where a.id=1;
    @Modifying
    @Query("update Author a set a.age = :age where a.id= :id")
            int updateAuthor(int age,int id);




    // Repo layer is close to database .Data Access object..

    //userDefinded methode.

    // select * from author where first_name="Ravi"....
    List<Author> findAllByFirstName(String firstName);


    List<Author> findAllByFirstNameIgnoreCase(String firstName);

    // select * from author where first_name like '%al%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);

    // select * from author where first_name like 'al%'
    List<Author> findAllByFirstNameStartsWithIgnoreCase(String firstName);


    // select * from author where first_name like '%al'
    List<Author> findAllByFirstNameEndsWithIgnoreCase(String firstName);



    // select * from author where first_name in('ali','bou','coding')
    List<Author> findAllByFirstNameInIgnoreCaseAuthors(List<String> firstName);

  //  List<User> findByFirstNameAndLastName(String fn, String ls);


    int countAllByAge(int age);

    void deleteAllByAge(int age);*/
}
