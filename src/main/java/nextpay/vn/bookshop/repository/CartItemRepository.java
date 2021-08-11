package nextpay.vn.bookshop.repository;

import nextpay.vn.bookshop.model.CartItem;
import nextpay.vn.bookshop.model.Order;
import nextpay.vn.bookshop.model.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartItemRepository extends CrudRepository<CartItem, Long> {
    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    List<CartItem> findByOrder(Order order);
}
