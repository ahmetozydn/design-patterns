package org.patterns.factory.pattern.inherit_example;

public class EmailNotification implements INotification {

    @Override
    public void notifyUser() {
        System.out.println("Sending an e-mail notification");
    }
}
