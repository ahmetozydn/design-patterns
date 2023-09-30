package org.patterns.observer.pattern;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        // Change the state of the subject, which will notify observers
        subject.setState(10);
        subject.setState(20);

        // Remove observer1 and change the state again
        subject.removeObserver(observer1);
        subject.setState(30);
    }
}