package bridgeDesignPattern.appBusiness;

public class SmsDataSender implements DataSender {

    @Override
    public String sendData() {
        return "Send data by sms >> ";
    }
}
