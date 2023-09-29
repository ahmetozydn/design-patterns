package org.example.builder.pattern;

public class Person {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    // Private constructor to prevent direct instantiation
    private Person() {
    }

    // Builder class
    public static class PersonBuilder {
        private String name;
        private int age;
        private String address;
        private String phoneNumber;

        public PersonBuilder(String name) {
            this.name = name;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.name = this.name;
            person.age = this.age;
            person.address = this.address;
            person.phoneNumber = this.phoneNumber;
            return person;
        }
    }

    // Getters for Person attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

