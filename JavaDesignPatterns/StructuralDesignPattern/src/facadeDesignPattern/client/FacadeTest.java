package facadeDesignPattern.client;


import facadeDesignPattern.facade.MobileFacade;

public class FacadeTest {
    public static void main(String[] args) {
        MobileFacade facade = new MobileFacade();
        facade.getIphoneDetails();
        facade.getSamsungDetails();


    }
}
