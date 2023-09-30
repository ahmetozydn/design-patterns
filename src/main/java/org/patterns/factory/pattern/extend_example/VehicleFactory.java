package org.patterns.factory.pattern.extend_example;

// Create a Factory class
class VehicleFactory {
    // Factory method to create instances based on a given type
    public Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("motorcycle")) {
            return new Motorcycle();
        }
        return null; // Return null if the type is not recognized
    }
}
