package chainOfResponsibility.customer;

public class CustomerRequest {

    private Priority priority;

    public CustomerRequest(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }


}

