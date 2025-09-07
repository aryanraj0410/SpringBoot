package com.learn.aryan.Learning;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Controller;

@Controller
@ConditionalOnProperty(name = "payment.method", havingValue = "Razorpay")
public class RazorpayService implements PaymentService{
        public String pay(){
            String payment  = "Razorpay Payment";
            System.out.println("Payment form "+payment);
            return  payment;
    }
}
