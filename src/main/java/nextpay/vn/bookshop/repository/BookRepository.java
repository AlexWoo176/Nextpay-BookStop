package nextpay.vn.bookshop.repository;

import nextpay.vn.bookshop.model.Book;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface BookRepository extends CrudRepository<Book,Long> {
    List<Book> findByCategory(String category);

    List<Book> findByTitleContaining(String title);
}
