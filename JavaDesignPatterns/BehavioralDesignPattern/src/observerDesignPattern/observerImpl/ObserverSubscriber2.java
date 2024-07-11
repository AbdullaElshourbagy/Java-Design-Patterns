package observerDesignPattern.observerImpl;

import observerDesignPattern.observer.Observer;

public class ObserverSubscriber2 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Subscriber 2 receive message >> " + message);
    }
}
