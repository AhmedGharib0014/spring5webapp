package bootstrap;


import domain.Author;
import domain.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import repositories.AutherRepository;
import repositories.BookRepository;

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
        System.out.println("start111");

        System.out.println();

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
