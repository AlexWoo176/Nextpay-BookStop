package nextpay.vn.admin.service;

import nextpay.vn.admin.model.Book;

import java.util.List;

public interface BookService {

    Book save(Book book);

    List<Book> findAll();

    Book findById(Long id);

    void deleteById(Long id);
}
