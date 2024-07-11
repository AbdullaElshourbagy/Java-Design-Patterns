package chainOfResponsibility.handlerImpl;

import chainOfResponsibility.customer.CustomerRequest;
import chainOfResponsibility.customer.Priority;
import chainOfResponsibility.handler.SupportHandler;

public class SupportLevel3Handler implements SupportHandler {

    @Override
    public void setNextHandler(SupportHandler nextHandler) {

        // no next handler

    }

    @Override
    public void handleRequest(CustomerRequest request) {
        if (request.getPriority() == Priority.CRITICAL) {
            System.out.println("Level 3 Support handled the request.");
        } else {
            System.out.println("support Failed");
        }
    }
}