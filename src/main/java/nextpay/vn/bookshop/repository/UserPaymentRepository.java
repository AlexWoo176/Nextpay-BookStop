package nextpay.vn.bookshop.repository;

import nextpay.vn.bookshop.model.UserPayment;
import org.springframework.data.repository.CrudRepository;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long> {
}
