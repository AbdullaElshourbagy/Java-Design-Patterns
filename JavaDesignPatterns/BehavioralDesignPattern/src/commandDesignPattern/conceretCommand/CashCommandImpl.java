package commandDesignPattern.conceretCommand;

import commandDesignPattern.command.BankCommand;
import commandDesignPattern.reciever.BankOperations;

public class CashCommandImpl implements BankCommand {

    BankOperations bankOperations = new BankOperations();


    @Override
    public void depositExecute() {
        bankOperations.depositBalance("Cash");

    }

    @Override
    public void withdrawExecute() {
        bankOperations.withdrawBalance("Cash");

    }
}
