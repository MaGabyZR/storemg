package com.magabyzr.storemg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class StoremgApplication {

    public static void main(String[] args) {
        //SpringApplication.run(StoremgApplication.class, args);
        //var orderService = new OrderService(new StripePaymentService());
        var orderService = new OrderService();
        orderService.setPaymentService(new PayPalPaymentService());                     //to use the setter from orderService.
        orderService.placeOrder();
    }

}
