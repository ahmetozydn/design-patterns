package org.patterns.facade.pattern;

// Subsystem 2: Transaction Processing
class TransactionProcessor {
    public void deposit(int accountNumber, double amount) {
        // Implementation to process a deposit
        System.out.println("Deposited $" + amount + " into Account #" + accountNumber);
    }

    public void withdraw(int accountNumber, double amount) {
        // Implementation to process a withdrawal
        System.out.println("Withdrawn $" + amount + " from Account #" + accountNumber);
    }
}
