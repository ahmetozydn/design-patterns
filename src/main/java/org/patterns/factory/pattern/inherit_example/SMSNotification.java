package org.patterns.factory.pattern.inherit_example;

public class SMSNotification implements INotification {

    @Override
    public void notifyUser() {
        // TODO Auto-generated method stub
        System.out.println("Sending an SMS notification");
    }
}
