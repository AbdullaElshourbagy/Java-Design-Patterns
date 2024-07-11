package templateDesignPattern.templateImpl;

import templateDesignPattern.template.DbOperation;

public class DevDbOperations extends DbOperation {


    @Override
    public void insertOperation() {
        System.out.println("You can insert new data into development db");
    }

    @Override
    public void updateOperation() {
        System.out.println("You can update  data into development db");

    }

    @Override
    public void deleteOperation() {
        System.out.println("You can delete data into development db");

    }
}
