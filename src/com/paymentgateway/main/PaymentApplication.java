package com.paymentgateway.main;

import com.paymentgateway.controller.PaymentController;
import com.paymentgateway.gateway.*;
import com.paymentgateway.repository.PaymentRepository;
import com.paymentgateway.service.PaymentService;

public class PaymentApplication {
    public static void main(String[] args) {
        PaymentRepository repository = new PaymentRepository();

        // Using PayPal Gateway
        PaymentGateway payPalGateway = new PayPalGateway();
        PaymentService paypalService = new PaymentService(payPalGateway, repository);
        PaymentController paypalController = new PaymentController(paypalService);

        // Using Stripe Gateway
        PaymentGateway stripeGateway = new StripeGateway();
        PaymentService stripeService = new PaymentService(stripeGateway, repository);
        PaymentController stripeController = new PaymentController(stripeService);

        // Simulating payments
        paypalController.processPaymentRequest("TXN123", 100.0, "USER001", "PayPal");
        stripeController.processPaymentRequest("TXN124", 50.0, "USER002", "Stripe");
    }
}
