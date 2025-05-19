package com.magabyzr.storemg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service                                                                     //or @Component Bean configuration with annotation.
public class OrderService {
    private PaymentService paymentService;                                  //setter below.

    //@Autowired                                                              //used in older versions and if you have multiple constructors.
    public OrderService(PaymentService paymentService){ this.paymentService = paymentService;}                   //also annotate the PayPalServiceService class

    public void placeOrder(){
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {          //setter.
        this.paymentService = paymentService;
    }
}
