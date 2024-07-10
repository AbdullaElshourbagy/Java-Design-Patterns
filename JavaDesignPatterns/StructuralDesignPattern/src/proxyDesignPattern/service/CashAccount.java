package proxyDesignPattern.service;

public class CashAccount implements BankAccount {


    @Override
    public String checkAccess() {
        return "Granted";

    }
}
