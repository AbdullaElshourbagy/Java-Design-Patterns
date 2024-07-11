package strategyDesignPattern.strategyImpl;

import strategyDesignPattern.strategy.PaymentStrategy;

public class PaypalPayment implements PaymentStrategy {

    private String email;
    private String password;


    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Amount paid from Paypal with amount >> " + amount);
    }
}
