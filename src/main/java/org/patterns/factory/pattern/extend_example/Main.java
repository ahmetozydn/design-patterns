package org.patterns.factory.pattern.extend_example;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        // Create instances using the factory
        Vehicle car = factory.createVehicle("car");
        Vehicle motorcycle = factory.createVehicle("motorcycle");

        // Use the created instances
        car.start(); // Output: Car is starting.
        motorcycle.start(); // Output: Motorcycle is starting.
    }
}