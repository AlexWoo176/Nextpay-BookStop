package nextpay.vn.bookshop.service;

import nextpay.vn.bookshop.model.UserPayment;

public interface UserPaymentService {
    UserPayment findById(Long id);

    void deteteById(Long id);
}
