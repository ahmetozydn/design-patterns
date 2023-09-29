package org.example.singleton.pattern;

public class Singleton {
    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        // Initialization code, if needed
    }

    // Public method to provide access to the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            // Create the instance if it doesn't exist yet
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and fields of the Singleton class
    public void doSomething() {
        System.out.println("Singleton instance is doing something.");
    }
}





