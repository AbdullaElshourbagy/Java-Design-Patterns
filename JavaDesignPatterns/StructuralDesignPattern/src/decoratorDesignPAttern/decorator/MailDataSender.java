package decoratorDesignPAttern.decorator;

import decoratorDesignPAttern.component.DataSources;

public class MailDataSender extends DataSender{
    public MailDataSender(DataSources sources) {
        super(sources);
    }

    @Override
    public String readData() {
        return "Send data by mail >> "+super.readData();
    }
}
