package com.paymentgateway.gateway;

import com.paymentgateway.model.Payment;

public interface PaymentGateway {
    boolean processPayment(Payment payment);
}
