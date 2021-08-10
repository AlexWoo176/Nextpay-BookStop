package nextpay.vn.bookshop.service;

import nextpay.vn.bookshop.model.Payment;
import nextpay.vn.bookshop.model.UserPayment;

public interface PaymentService {
    Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
