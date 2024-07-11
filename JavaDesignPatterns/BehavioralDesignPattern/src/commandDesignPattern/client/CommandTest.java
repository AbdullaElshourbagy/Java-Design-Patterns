package commandDesignPattern.client;

import commandDesignPattern.command.BankCommand;
import commandDesignPattern.conceretCommand.CashCommandImpl;
import commandDesignPattern.conceretCommand.CreditCardCommandImpl;
import commandDesignPattern.invoker.BankInvoker;

public class CommandTest {
    public static void main(String[] args) {
        BankCommand cashCommand = new CashCommandImpl();
        BankCommand creditCommand = new CreditCardCommandImpl();

        BankInvoker invoker = new BankInvoker(cashCommand);
        invoker.executeDeposit();
        invoker.executeWithdrawal();

        invoker = new BankInvoker(creditCommand);
        invoker.executeDeposit();
        invoker.executeWithdrawal();

        System.out.println(" *******************  For queue *****************");
        invoker.resetCommandsQueue().addCommandToQueue(cashCommand);
        invoker.addCommandToQueue(creditCommand);
        invoker.executeDepositForAllCommands();
        invoker.executeWithdrawalForAllCommands();

    }
}
