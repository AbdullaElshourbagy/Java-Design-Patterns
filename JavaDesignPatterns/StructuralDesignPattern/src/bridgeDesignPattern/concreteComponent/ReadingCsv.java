package bridgeDesignPattern.concreteComponent;

import bridgeDesignPattern.bridge.DataSources;
import bridgeDesignPattern.appBusiness.DataSender;

public class ReadingCsv extends DataSources {
    public ReadingCsv(DataSender dataSender) {
        super(dataSender);
    }

    @Override
    public String readData() {
        return dataSender.sendData()+ "10,abdalla ahmed,30";
    }
}
