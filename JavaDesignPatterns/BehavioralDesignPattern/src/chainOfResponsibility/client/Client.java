package chainOfResponsibility.client;

import chainOfResponsibility.customer.CustomerRequest;
import chainOfResponsibility.customer.Priority;
import chainOfResponsibility.handler.SupportHandler;
import chainOfResponsibility.handlerImpl.SupportLevel1Handler;
import chainOfResponsibility.handlerImpl.SupportLevel2Handler;
import chainOfResponsibility.handlerImpl.SupportLevel3Handler;

public class Client {

    public static void main(String[] args) {
        SupportHandler level1Handler = new SupportLevel1Handler();
        SupportHandler level2Handler = new SupportLevel2Handler();
        SupportHandler level3Handler = new SupportLevel3Handler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        CustomerRequest request1 = new CustomerRequest(Priority.BASIC);
        CustomerRequest request2 = new CustomerRequest(Priority.INTERMEDIATE);
        CustomerRequest request3 = new CustomerRequest(Priority.CRITICAL);

        level1Handler.handleRequest(request3);
        level1Handler.handleRequest(request2);
        level1Handler.handleRequest(request1);
    }
}
