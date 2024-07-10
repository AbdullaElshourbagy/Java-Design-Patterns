package proxyDesignPattern.proxy;

import proxyDesignPattern.service.BankAccount;
import proxyDesignPattern.service.CashAccount;

public class CashProxy implements BankAccount {
    CashAccount cashAccount;
    private int accessToken;

    public CashProxy(int accessToken) {
        this.accessToken = accessToken;
    }


    @Override
    public String checkAccess() {
        if (accessToken == 101) {
            return "Granted permitted";
        }
        cashAccount = new CashAccount();
        return cashAccount.checkAccess();

    }


}
