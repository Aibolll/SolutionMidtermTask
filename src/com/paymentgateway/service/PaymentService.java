package com.paymentgateway.service;

import com.paymentgateway.gateway.PaymentGateway;
import com.paymentgateway.model.Payment;
import com.paymentgateway.repository.PaymentRepository;

public class PaymentService {
    private PaymentGateway paymentGateway;
    private PaymentRepository paymentRepository;

    public PaymentService(PaymentGateway paymentGateway, PaymentRepository paymentRepository) {
        this.paymentGateway = paymentGateway;
        this.paymentRepository = paymentRepository;
    }

    public boolean processPayment(Payment payment) {
        boolean success = paymentGateway.processPayment(payment);
        if (success) {
            paymentRepository.savePayment(payment);
        }
        return success;
    }
}
