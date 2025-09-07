package com.learn.aryan.Learning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public  class LearningApplication implements CommandLineRunner {

    public LearningApplication(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public static void main(String[] args) {
            SpringApplication.run(LearningApplication.class, args);
        }


    public final PaymentService paymentService;

    @Override
    public void run(String... args) throws Exception {
        String payment  = paymentService.pay();
        System.out.println("Payment done "+ payment);
    }
}