package nextpay.vn.bookshop.service;

import nextpay.vn.bookshop.model.UserShipping;

public interface UserShippingService {
    UserShipping findById(Long id);

    void deleteById(Long id);
}
