package nextpay.vn.bookshop.service.impl;

import nextpay.vn.bookshop.model.UserShipping;
import nextpay.vn.bookshop.service.UserShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserShippingRepository;

@Service
public class UserShippingServiceImpl implements UserShippingService {

    @Autowired
    private UserShippingRepository userShippingRepository;


    public UserShipping findById(Long id) {
        return userShippingRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        userShippingRepository.deleteById(id);
    }

}
