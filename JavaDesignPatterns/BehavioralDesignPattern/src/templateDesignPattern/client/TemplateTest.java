package templateDesignPattern.client;

import templateDesignPattern.template.DbOperation;
import templateDesignPattern.templateImpl.DevDbOperations;
import templateDesignPattern.templateImpl.ProdDbOperations;

public class TemplateTest {
    public static void main(String[] args) {
        DbOperation dev = new DevDbOperations();
        dev.showDbOperations();

        DbOperation prod = new ProdDbOperations();
        prod.showDbOperations();


    }
}
