package nextpay.vn.admin.repositoty;

import nextpay.vn.admin.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
