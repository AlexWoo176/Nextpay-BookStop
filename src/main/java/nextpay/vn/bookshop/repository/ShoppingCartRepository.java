package nextpay.vn.bookshop.repository;

import nextpay.vn.bookshop.model.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {
}
