package commandDesignPattern.invoker;

import commandDesignPattern.command.BankCommand;

import java.util.ArrayList;
import java.util.List;

public class BankInvoker {

    private BankCommand command;
    private List<BankCommand> commands = new ArrayList<BankCommand>();

    public BankInvoker(BankCommand command) {
        this.command = command;
        this.commands.add(command);
    }

    public void addCommandToQueue(BankCommand command) {
        this.commands.add(command);

    }

    public BankInvoker resetCommandsQueue() {

        this.commands.clear();
        return this;
    }

    public void executeWithdrawal() {
        System.out.println("Balance before 200");
        // business logic will be added to use in invoker like logging auditing or update balance
        this.command.withdrawExecute();
        // business logic will be added to use in invoker like logging auditing or update balance
        System.out.println("Balance after 150");

    }

    public void executeDeposit() {
        // business logic will be added to use in invoker like logging auditing or update balance

        this.command.depositExecute();
        // business logic will be added to use in invoker like logging auditing or update balance

    }

    public void executeWithdrawalForAllCommands() {
        this.commands.stream().forEach(p -> {
            System.out.println("Balance before 100");
            p.withdrawExecute();
            System.out.println("Balance before 20");
        });

    }

    public void executeDepositForAllCommands() {
        this.commands.stream().forEach(p -> p.depositExecute());
    }

}
