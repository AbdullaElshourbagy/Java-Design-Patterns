package iteratoeDesignPattern.concreteIterator;

import iteratoeDesignPattern.client.Employee;
import iteratoeDesignPattern.iterator.Iterator;

import java.util.List;

public class EmployeeIterator implements Iterator {
    private List<Employee> employees;
    private int position;

    public EmployeeIterator(List<Employee> employees) {
        this.employees = employees;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position < employees.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object getNext() {
        return employees.get(position++);
    }
}
