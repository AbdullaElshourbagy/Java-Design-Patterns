package strategyDesignPattern.strategyImpl;

import strategyDesignPattern.strategy.PaymentStrategy;

public class MasterCardPayment implements PaymentStrategy {

    private String accountName;
    private String expireDate;
    private int ccv;
    private String cardNo;

    public MasterCardPayment(String accountName, String expireDate, int ccv, String cardNo) {
        this.accountName = accountName;
        this.expireDate = expireDate;
        this.ccv = ccv;
        this.cardNo = cardNo;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Amount paid from Master card with amount >> " + amount);
    }
}
