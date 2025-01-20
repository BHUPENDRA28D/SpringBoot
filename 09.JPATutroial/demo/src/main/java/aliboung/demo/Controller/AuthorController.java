package aliboung.demo.Controller;

import aliboung.demo.Entity.Author;

import aliboung.demo.Serviecs.AuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class AuthorController {

    private static final Logger logger = Logger.getLogger(AuthorController.class.getName());

    @Autowired
    private aliboung.demo.Serviecs.AuthorServices authorServices;

    @PostMapping("/authors")
    public Author saveAuthor(@RequestBody Author author) {
        logger.info("Saving author: " + author);
        return authorServices.saveAuthor(author);
    }

    @GetMapping("/authors")
    public List<Author> fetchAuthorsList() {
        logger.info("Fetching authors list");
        List<Author> authors = authorServices.fetchAuthorsList();
        logger.info("Authors found: " + authors);
        return authors;
    }
}
