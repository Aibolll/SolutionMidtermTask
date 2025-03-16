package com.paymentgateway.gateway;

import com.paymentgateway.model.Payment;

public class PayPalGateway implements PaymentGateway {
    @Override
    public boolean processPayment(Payment payment) {
        System.out.println("Processing payment via PayPal: " + payment.getAmount());
        return true;
    }
}
