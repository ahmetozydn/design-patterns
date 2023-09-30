package org.patterns.facade.pattern;

// Subsystem 1: Account Management
class Account {
    public void createAccount(String owner, double initialBalance) {
        // Implementation to create a bank account
        System.out.println("Account created for " + owner + " with initial balance: $" + initialBalance);
    }

    public void closeAccount(int accountNumber) {
        // Implementation to close a bank account
        System.out.println("Account #" + accountNumber + " closed.");
    }
}
