package aliboung.demo.Serviecs;


import aliboung.demo.Entity.Author;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorServices {



    Author saveAuthor(Author author);

    List<Author> fetchAuthorsList();
}
