package templateDesignPattern.templateImpl;

import templateDesignPattern.template.DbOperation;

public class ProdDbOperations extends DbOperation {


    @Override
    public void insertOperation() {
        System.out.println("You can insert new data into production db");
    }

    @Override
    public void updateOperation() {
        System.out.println("You can update  data into production db");

    }

    @Override
    public void deleteOperation() {
        System.out.println("You cannot delete data into production db");

    }
}
