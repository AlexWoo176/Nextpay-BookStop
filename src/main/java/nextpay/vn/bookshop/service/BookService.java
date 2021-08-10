package nextpay.vn.bookshop.service;

import nextpay.vn.bookshop.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll ();

    Book findById(Long id);

    List<Book> findByCategory(String category);

    List<Book> blurrySearch(String title);
}
