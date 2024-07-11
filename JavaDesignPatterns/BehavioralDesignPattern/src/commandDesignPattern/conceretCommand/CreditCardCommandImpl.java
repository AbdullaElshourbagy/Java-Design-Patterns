package commandDesignPattern.conceretCommand;

import commandDesignPattern.command.BankCommand;
import commandDesignPattern.reciever.BankOperations;

public class CreditCardCommandImpl implements BankCommand {

    BankOperations bankOperations = new BankOperations();


    @Override
    public void depositExecute() {
        bankOperations.depositBalance("Credit Card");

    }

    @Override
    public void withdrawExecute() {
        bankOperations.withdrawBalance("Credit Card");

    }
}
