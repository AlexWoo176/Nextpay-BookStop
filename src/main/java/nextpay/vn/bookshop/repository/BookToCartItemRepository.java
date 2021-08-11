package nextpay.vn.bookshop.repository;

import nextpay.vn.bookshop.model.BookToCartItem;
import nextpay.vn.bookshop.model.CartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {

        void deleteByCartItem(CartItem cartItem);
}


