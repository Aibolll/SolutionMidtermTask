package com.paymentgateway.gateway;

import com.paymentgateway.model.Payment;

public class StripeGateway implements PaymentGateway {
    @Override
    public boolean processPayment(Payment payment) {
        System.out.println("Processing payment via Stripe: " + payment.getAmount());
        return true;
    }
}
