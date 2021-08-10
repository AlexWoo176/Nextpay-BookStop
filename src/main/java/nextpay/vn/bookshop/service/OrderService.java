package nextpay.vn.bookshop.service;

import nextpay.vn.bookshop.model.*;

public interface OrderService {
    Order createOrder(ShoppingCart shoppingCart,
                      ShippingAddress shippingAddress,
                      BillingAddress billingAddress,
                      Payment payment,
                      String shippingMethod,
                      User user);

    Order findById(Long id);
}
