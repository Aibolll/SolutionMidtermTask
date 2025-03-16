package com.paymentgateway.controller;

import com.paymentgateway.model.Payment;
import com.paymentgateway.service.PaymentService;

public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processPaymentRequest(String transactionId, double amount, String userId, String method) {
        Payment payment = new Payment(transactionId, amount, userId, method);
        boolean success = paymentService.processPayment(payment);
        if (success) {
            System.out.println("Payment successful for transaction: " + transactionId);
        } else {
            System.out.println("Payment failed for transaction: " + transactionId);
        }
    }
}
