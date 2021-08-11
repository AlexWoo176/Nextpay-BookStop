package nextpay.vn.bookshop.repository;

import nextpay.vn.bookshop.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
