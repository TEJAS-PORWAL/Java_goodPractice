package other.packaging.byfeature.author;

import java.util.List;
import java.util.Optional;

class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Optional<Author> getAuthorById(String id) {
        return authorRepository.findById(id);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public void deleteAuthor(String id) {
        Optional<Author> author = authorRepository.findById(id);
        author.ifPresent(authorRepository::delete);
    }


}
