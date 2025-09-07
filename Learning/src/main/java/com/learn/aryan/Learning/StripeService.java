package com.learn.aryan.Learning;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Controller;

import java.sql.SQLOutput;
@Controller
@ConditionalOnProperty(name = "payment.method", havingValue = "Stripe")
public class StripeService implements PaymentService{

    @Override
    public String pay() {
        String payment  = "Stripe Payment";
        System.out.println("Payment form " +payment);
        return payment;
    }
}
