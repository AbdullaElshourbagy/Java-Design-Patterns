package strategyDesignPattern.client;

import strategyDesignPattern.strategy.PaymentStrategy;
import strategyDesignPattern.strategyContext.Payment;
import strategyDesignPattern.strategyImpl.MasterCardPayment;
import strategyDesignPattern.strategyImpl.PaypalPayment;
import strategyDesignPattern.strategyImpl.VisaCardPayment;

public class StrategyTest {
    public static void main(String[] args) {
        PaymentStrategy visa = new VisaCardPayment("ABDALLA AHMED", "10/26", 456, "1231 4567 9542");
        PaymentStrategy master = new MasterCardPayment("KAMAL AHMED", "10/26", 456, "1231 4567 9542");
        PaymentStrategy paypal = new PaypalPayment("test@gmail.com", "1234555");

        Payment payment= new Payment();

        payment.doPayment(1500,visa);
        payment.doPayment(1500,master);
        payment.doPayment(1500,paypal);



    }
}
