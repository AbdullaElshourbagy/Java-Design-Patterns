package proxyDesignPattern.client;

import proxyDesignPattern.proxy.CashProxy;
import proxyDesignPattern.service.CashAccount;

public class ProxyTest {

    public static void main(String[] args) {
// without Proxy
        CashAccount cashAccount = new CashAccount();
        System.out.println(cashAccount.checkAccess());

// with proxy
        CashProxy cashProxy = new CashProxy(101);
        System.out.println(cashProxy.checkAccess());

        cashProxy = new CashProxy(100);
        System.out.println(cashProxy.checkAccess());
    }
}
