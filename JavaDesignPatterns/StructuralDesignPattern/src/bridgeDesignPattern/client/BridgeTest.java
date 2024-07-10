package bridgeDesignPattern.client;


import bridgeDesignPattern.bridge.DataSources;
import bridgeDesignPattern.concreteComponent.ReadingCsv;
import bridgeDesignPattern.concreteComponent.ReadingXml;
import bridgeDesignPattern.appBusiness.DataSender;
import bridgeDesignPattern.appBusiness.MailDataSender;
import bridgeDesignPattern.appBusiness.SmsDataSender;

public class BridgeTest {
    public static void main(String[] args) {

        DataSender sendSms = new SmsDataSender();
        DataSender sendMail = new MailDataSender();

        DataSources xml = new ReadingXml(sendMail);
        DataSources csv = new ReadingCsv(sendMail);


        System.out.println(xml.readData());
        System.out.println(csv.readData());

          xml = new ReadingXml(sendSms);
          csv = new ReadingCsv(sendSms);


        System.out.println(xml.readData());
        System.out.println(csv.readData());

    }


}
