package compositeDesignPattern.composite;

import compositeDesignPattern.component.Employee;

import java.util.ArrayList;
import java.util.List;

public class BankManager implements Employee {
    private int id;
    private String name;
    private String jobId;
    private double salary;

    public BankManager(int id, String name, String jobId, double salary) {
        this.id = id;
        this.name = name;
        this.jobId = jobId;
        this.salary = salary;
    }

    List<Employee> employees = new ArrayList<Employee>();

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getJobId() {
        return jobId;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("=============Manager=============");
        System.out.println("Id =" + getId());
        System.out.println("Name =" + getName());
        System.out.println("Salary =" + getSalary());
        System.out.println("job =" + getJobId());
        System.out.println("===========the employee of Manager ===============");

        employees.stream().forEach(p -> p.print());


    }
}