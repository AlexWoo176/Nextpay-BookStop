package nextpay.vn.admin.service;

import nextpay.vn.admin.model.User;
import nextpay.vn.admin.model.security.UserRole;

import java.util.Set;

public interface UserService {
    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User user);
}
