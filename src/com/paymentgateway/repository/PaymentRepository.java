package com.paymentgateway.repository;

import com.paymentgateway.model.Payment;
import java.util.ArrayList;
import java.util.List;

public class PaymentRepository {
    private List<Payment> payments = new ArrayList<>();

    public void savePayment(Payment payment) {
        payments.add(payment);
        System.out.println("Payment saved: " + payment.getTransactionId());
    }

    public List<Payment> getPayments() {
        return payments;
    }
}
