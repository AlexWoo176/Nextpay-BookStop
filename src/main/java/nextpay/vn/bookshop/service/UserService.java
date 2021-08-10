package nextpay.vn.bookshop.service;

import nextpay.vn.bookshop.model.User;
import nextpay.vn.bookshop.model.UserBilling;
import nextpay.vn.bookshop.model.UserPayment;
import nextpay.vn.bookshop.model.UserShipping;
import nextpay.vn.bookshop.model.security.PasswordResetToken;
import nextpay.vn.bookshop.model.security.UserRole;

import java.util.Set;

public interface UserService {
    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);

    User findByUsername(String username);

    User findByEmail (String email);

    User findById(Long id);

    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User user);

    void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);

    void updateUserShipping(UserShipping userShipping, User user);

    void setUserDefaultPayment(Long userPaymentId, User user);

    void setUserDefaultShipping(Long userShippingId, User user);
}
