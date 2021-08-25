package nextpay.vn.admin.repositoty;

import nextpay.vn.admin.model.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByname(String name);
}
