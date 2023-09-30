package org.patterns.factory.pattern.extend_example;

// Define the subclasses
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
}
