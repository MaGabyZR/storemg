package com.magabyzr.storemg;

public class OrderService {
    public void placeOrder(){
        var paymentService = new StripePaymentService();
        paymentService.processPayment(10);

    }
}
