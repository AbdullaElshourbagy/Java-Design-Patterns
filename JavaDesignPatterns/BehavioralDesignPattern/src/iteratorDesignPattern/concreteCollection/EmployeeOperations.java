package iteratorDesignPattern.concreteCollection;

import iteratorDesignPattern.client.Employee;
import iteratorDesignPattern.collection.EmployeeList;
import iteratorDesignPattern.concreteIterator.EmployeeIterator;
import iteratorDesignPattern.iterator.Iterator;

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
