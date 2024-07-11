package observerDesignPattern.observerImpl;

import observerDesignPattern.observer.Observer;

public class ObserverSubscriber3 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Subscriber 3 receive message >> " + message);
    }
}
