package observerDesignPattern.client;

import observerDesignPattern.observer.Observer;
import observerDesignPattern.observerImpl.ObserverSubscriber1;
import observerDesignPattern.observerImpl.ObserverSubscriber2;
import observerDesignPattern.observerImpl.ObserverSubscriber3;
import observerDesignPattern.subject.Subject;
import observerDesignPattern.subjectImpl.SubjectPublisher;

public class ObserverTest {
    public static void main(String[] args) {
        Observer subscriber1 = new ObserverSubscriber1();
        Observer subscriber2 = new ObserverSubscriber2();
        Observer subscriber3 = new ObserverSubscriber3();

        Subject subject = new SubjectPublisher();
        subject.addSubscriber(subscriber1);
        subject.addSubscriber(subscriber2);
        subject.addSubscriber(subscriber3);

        subject.notify("First Message");


        System.out.println(" \n\n ************* remove subscriber 1");
        subject.removeSubscriber(subscriber1);
        subject.notify("Second Message");
    }
}
