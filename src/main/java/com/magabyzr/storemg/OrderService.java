package com.magabyzr.storemg;

public class OrderService {
    private PaymentService paymentService;                                  //setter below.

//    public OrderService(PaymentService paymentService){
//       this.paymentService = paymentService;
//    }

    public void placeOrder(){
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {          //setter.
        this.paymentService = paymentService;
    }
}
