package nextpay.vn.bookshop.service.impl;

import nextpay.vn.bookshop.model.UserPayment;
import nextpay.vn.bookshop.service.UserPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserPaymentRepository;

@Service
public class UserPaymentServiceImpl implements UserPaymentService {

    @Autowired
    private UserPaymentRepository userPaymentRepository;

    public UserPayment findById(Long id) {
        return userPaymentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        userPaymentRepository.deleteById(id);
    }

}
