package org.patterns.builder.pattern;

// Usage
public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("John")
                .age(30)
                .address("123 Main St")
                .phoneNumber("555-1234")
                .build();

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Phone Number: " + person.getPhoneNumber());
    }
}
