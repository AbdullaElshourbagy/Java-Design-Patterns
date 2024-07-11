package iteratoeDesignPattern.client;

import iteratoeDesignPattern.collection.EmployeeList;
import iteratoeDesignPattern.concreteCollection.EmployeeOperations;
import iteratoeDesignPattern.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1,"abdalla"));
        employees.add(new Employee(2,"ahmed"));
        employees.add(new Employee(3,"younies"));

        Iterator iterator = new EmployeeOperations(employees).generateIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.getNext().toString());
        }
    }
}
