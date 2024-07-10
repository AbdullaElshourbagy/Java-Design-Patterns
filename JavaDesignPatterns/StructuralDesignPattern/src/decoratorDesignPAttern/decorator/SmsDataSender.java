package decoratorDesignPAttern.decorator;

import decoratorDesignPAttern.component.DataSources;

public class SmsDataSender extends DataSender {

    public SmsDataSender(DataSources sources) {
        super(sources);
    }

    @Override
    public String readData() {
        return "Send data by sms >> " + super.readData();
    }
}
