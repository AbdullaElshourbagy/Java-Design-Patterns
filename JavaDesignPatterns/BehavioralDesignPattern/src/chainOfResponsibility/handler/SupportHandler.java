package chainOfResponsibility.handler;

import chainOfResponsibility.customer.CustomerRequest;

public interface SupportHandler {

    void handleRequest(CustomerRequest request);
    void setNextHandler(SupportHandler nextHandler);
}
