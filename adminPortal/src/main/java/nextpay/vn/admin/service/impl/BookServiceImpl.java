package nextpay.vn.admin.service.impl;

import nextpay.vn.admin.model.Book;
import nextpay.vn.admin.repositoty.BookRepository;
import nextpay.vn.admin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

}
