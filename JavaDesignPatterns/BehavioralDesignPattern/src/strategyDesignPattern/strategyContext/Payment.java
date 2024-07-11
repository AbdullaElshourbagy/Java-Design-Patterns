package strategyDesignPattern.strategyContext;

import strategyDesignPattern.strategy.PaymentStrategy;

public class Payment {


    public void doPayment(double amount, PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(amount);

    }
}
