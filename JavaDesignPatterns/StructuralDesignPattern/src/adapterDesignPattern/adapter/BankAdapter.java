package adapterDesignPattern.adapter;

import adapterDesignPattern.adaptee.BankCustomerDetails;
import adapterDesignPattern.target.CreditCard;

public class BankAdapter implements CreditCard {
   private BankCustomerDetails bankCustomerDetails;

   public BankAdapter(BankCustomerDetails details){

       this.bankCustomerDetails=details;
   }



    @Override
    public void getBankDetails() {
        System.out.println(bankCustomerDetails.toString());
    }

    @Override
    public String getCreditCard() {
        return "Account no "+bankCustomerDetails.getAccountNumber();
    }
}
