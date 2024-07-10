package adapterDesignPattern.client;

import adapterDesignPattern.adaptee.BankCustomerDetails;
import adapterDesignPattern.adapter.BankAdapter;
import adapterDesignPattern.target.CreditCard;

public class AdapterTest {
    public static void main(String[] args) {
        CreditCard bank = new BankAdapter(new BankCustomerDetails("CIB", "Abdalla Ahmed", 10101020));
        bank.getBankDetails();
        System.out.println(bank.getCreditCard());
    }
}
