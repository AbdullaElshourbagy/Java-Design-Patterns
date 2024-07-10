package bridgeDesignPattern.appBusiness;



public class MailDataSender implements DataSender {

    @Override
    public String sendData() {
        return "Send data by mail >> ";
    }
}
