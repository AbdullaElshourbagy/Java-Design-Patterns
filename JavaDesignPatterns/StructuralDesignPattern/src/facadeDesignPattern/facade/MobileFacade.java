package facadeDesignPattern.facade;

import facadeDesignPattern.complexSystem.Iphone;
import facadeDesignPattern.complexSystem.Mobile;
import facadeDesignPattern.complexSystem.Samsung;

public class MobileFacade {
    private Mobile iphone;
    private Mobile samsung;

    public MobileFacade() {
        this.iphone = new Iphone();
        this.samsung = new Samsung();
    }


    public void getIphoneDetails() {
        System.out.println("Mobile name " + iphone.getMobileName() + " >> price " + iphone.getPrice());
    }

    public void getSamsungDetails() {
        System.out.println("Mobile name " + samsung.getMobileName() + " >> price " + samsung.getPrice());
    }
}
