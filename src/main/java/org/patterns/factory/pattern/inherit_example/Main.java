package org.patterns.factory.pattern.inherit_example;


public class Main {
    public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        INotification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
