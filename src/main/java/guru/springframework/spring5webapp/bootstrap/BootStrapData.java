package guru.springframework.spring5webapp.bootstrap;


import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import guru.springframework.spring5webapp.repositories.AutherRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AutherRepository autherRepository;
    private final  BookRepository bookRepository;

    public BootStrapData(AutherRepository autherRepository, BookRepository bookRepository) {
        this.autherRepository = autherRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author= new Author("ahmed", "gharib");
        Book  book = new Book("book", "123");
        author.getBook().add(book);
        book.getAuthors().add(author);
        autherRepository.save(author);
        bookRepository.save(book);
        System.out.println("start");
        System.out.println(bookRepository.count());


    }
}
