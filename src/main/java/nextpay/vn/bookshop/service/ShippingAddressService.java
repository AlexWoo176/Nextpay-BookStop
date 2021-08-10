package nextpay.vn.bookshop.service;

import nextpay.vn.bookshop.model.ShippingAddress;
import nextpay.vn.bookshop.model.UserShipping;

public interface ShippingAddressService {
    ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
