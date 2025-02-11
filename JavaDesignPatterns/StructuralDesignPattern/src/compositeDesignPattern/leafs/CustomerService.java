package compositeDesignPattern.leafs;

import compositeDesignPattern.component.Employee;

public class CustomerService implements Employee{

    private int id;
    private String name;
    private String jobId;
    private double salary;

    public CustomerService(int id, String name, String jobId, double salary) {
        this.id = id;
        this.name = name;
        this.jobId = jobId;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
        //this is leaf node so this method is not applicable to this class.
    }
    @Override
    public Employee getChild(int i) {
        //this is leaf node so this method is not applicable to this class.
        return null;
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
        System.out.println("===============employee leaf");
        System.out.println("Id ="+getId());
        System.out.println("Name ="+getName());
        System.out.println("Salary ="+getSalary());
        System.out.println("job ="+getJobId());
    }
    @Override
    public void remove(Employee employee) {
        //this is leaf node so this method is not applicable to this class.
    }
}