package observerDesignPattern.observerImpl;

import observerDesignPattern.observer.Observer;

public class ObserverSubscriber1 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Subscriber 1 receive message >> " + message);
    }
}
