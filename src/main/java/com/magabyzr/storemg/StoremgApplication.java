package com.magabyzr.storemg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class StoremgApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoremgApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        //var orderService = new OrderService(new StripePaymentService());
        //var orderService = new OrderService(new PayPalPaymentService());                 //replaced by Bean, so Spring creates objects and injects dependencies automatically for us.
        //orderService.setPaymentService(new PayPalPaymentService());                     //to use the setter from orderService.
        orderService.placeOrder();

        //to send a message
        //var manager = context.getBean(NotificationManager.class);
        //manager.sendNotification("This is a test message");

        //to create a HeavyResource with Lazy
        var resource = context.getBean(HeavyResource.class);

    }

}
