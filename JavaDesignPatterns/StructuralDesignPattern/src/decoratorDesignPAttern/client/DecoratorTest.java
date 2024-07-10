package decoratorDesignPAttern.client;


import decoratorDesignPAttern.component.DataSources;
import decoratorDesignPAttern.concreteComponent.ReadingCsv;
import decoratorDesignPAttern.concreteComponent.ReadingXml;
import decoratorDesignPAttern.decorator.DataSender;
import decoratorDesignPAttern.decorator.MailDataSender;
import decoratorDesignPAttern.decorator.SmsDataSender;

public class DecoratorTest {
    public static void main(String[] args) {

        DataSources xml = new ReadingXml();
        DataSources csv = new ReadingCsv();
        DataSender sendSms = new SmsDataSender(xml);
        DataSender sendMail = new MailDataSender(xml);

        System.out.println(sendSms.readData());
        System.out.println(sendMail.readData());


        sendSms = new SmsDataSender(csv);
        sendMail = new MailDataSender(csv);
        System.out.println(sendSms.readData());
        System.out.println(sendMail.readData());

    }


}
