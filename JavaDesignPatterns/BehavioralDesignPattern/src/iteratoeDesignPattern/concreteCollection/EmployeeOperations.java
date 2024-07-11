package iteratoeDesignPattern.concreteCollection;

import iteratoeDesignPattern.client.Employee;
import iteratoeDesignPattern.collection.EmployeeList;
import iteratoeDesignPattern.concreteIterator.EmployeeIterator;
import iteratoeDesignPattern.iterator.Iterator;

import java.util.List;

public class EmployeeOperations implements EmployeeList {

    private List<Employee> employees;

    public EmployeeOperations(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator generateIterator() {
        return new EmployeeIterator(employees);
    }
}
