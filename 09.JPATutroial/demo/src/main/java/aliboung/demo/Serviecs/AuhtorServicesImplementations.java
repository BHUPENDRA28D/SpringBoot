package aliboung.demo.Serviecs;

import aliboung.demo.Entity.Author;
import aliboung.demo.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuhtorServicesImplementations implements AuthorServices{

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Author> fetchAuthorsList() {
     return authorRepository.findAll();
    }
}
