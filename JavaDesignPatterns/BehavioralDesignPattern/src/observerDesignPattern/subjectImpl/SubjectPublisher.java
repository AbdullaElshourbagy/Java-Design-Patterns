package observerDesignPattern.subjectImpl;

import observerDesignPattern.observer.Observer;
import observerDesignPattern.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectPublisher implements Subject {

    List<Observer> subscribers = new ArrayList<Observer>();

    @Override
    public void addSubscriber(Observer subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notify(String message) {
        subscribers.stream().forEach(p -> p.update(message));

    }
}
