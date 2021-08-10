package nextpay.vn.bookshop.service;

import nextpay.vn.bookshop.model.BillingAddress;
import nextpay.vn.bookshop.model.UserBilling;

public interface BillingAddressService {
    BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
