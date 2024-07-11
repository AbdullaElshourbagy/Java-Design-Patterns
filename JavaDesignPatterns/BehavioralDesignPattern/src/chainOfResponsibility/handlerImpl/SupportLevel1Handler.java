package chainOfResponsibility.handlerImpl;

import chainOfResponsibility.customer.CustomerRequest;
import chainOfResponsibility.customer.Priority;
import chainOfResponsibility.handler.SupportHandler;

public class SupportLevel1Handler implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(CustomerRequest request) {
        if (request.getPriority() == Priority.BASIC) {
            System.out.println("Level 1 Support handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }


    }
}