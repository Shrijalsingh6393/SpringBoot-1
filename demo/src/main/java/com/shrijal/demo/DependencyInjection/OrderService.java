package com.shrijal.demo.DependencyInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

//    @Autowired   // connected OrderService and PaymentService without it we get NullPointerException
    PaymentService paymentService;   // field injection


    //constructor injection (no need to write autowired for one constructor)
    OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }


    // setter injection

//    @Autowired
    public void setPaymentService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.payment();
        System.out.println("order placed");
    }
}


// methods to use a class before a class

//1.Field Injection  2. Constructor Injection  3.Setter Injection