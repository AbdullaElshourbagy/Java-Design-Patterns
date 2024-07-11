package observerDesignPattern.subject;

import observerDesignPattern.observer.Observer;

public interface Subject {

    void addSubscriber(Observer subscriber);
    void removeSubscriber(Observer subscriber);
    void notify(String message);
}
