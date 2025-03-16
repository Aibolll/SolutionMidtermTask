package com.paymentgateway.model;

public class Payment {
    private String transactionId;
    private double amount;
    private String userId;
    private String paymentMethod;

    public Payment(String transactionId, double amount, String userId, String paymentMethod) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.userId = userId;
        this.paymentMethod = paymentMethod;
    }

    public String getTransactionId() { return transactionId; }
    public double getAmount() { return amount; }
    public String getUserId() { return userId; }
    public String getPaymentMethod() { return paymentMethod; }
}
