package org.patterns.singleton.pattern;

/*

    The Singleton pattern is a creational design pattern in Java that ensures that
    a class has only one instance and provides a global point of access to that instance.
    This is useful when exactly one object is needed to coordinate actions across the system,
    such as a configuration manager or a logging service.

*/

public class Main {
    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton singleton = Singleton.getInstance();

        // Call a method on the Singleton instance
        singleton.doSomething();
    }
}
