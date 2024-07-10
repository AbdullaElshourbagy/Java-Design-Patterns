package compositeDesignPattern.client;

import compositeDesignPattern.component.Employee;
import compositeDesignPattern.composite.BankManager;
import compositeDesignPattern.leafs.Accountant;
import compositeDesignPattern.leafs.CustomerService;

public class CompositeTest {

    public static void main(String args[]){
        Employee emp1=new CustomerService(101,"Ahmed", "CS",20000.0);
        Employee emp2=new CustomerService(102,"Kamal","CS" ,25000.0);
        Employee emp3=new Accountant(103,"Younies", "ACC",30000.0);
        Employee manager=new BankManager(100,"Abdalla","Manager",100000.0);

        manager.add(emp1);
        manager.add(emp2);
        manager.add(emp3);
        manager.print();
    }
}
