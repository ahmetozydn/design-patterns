package org.patterns.facade.pattern;

// Facade

/*
* The Facade design pattern is a structural design pattern that provides a simplified interface
* to a complex system of classes, libraries, or APIs. It encapsulates the interactions and
* complexities of the underlying system and presents a higher-level interface that is easier to use.
* The Facade pattern promotes loose coupling between clients and the system's components,
* making the code more maintainable and understandable.
*/
class BankFacade {
    private Account account;
    private TransactionProcessor transactionProcessor;

    public BankFacade() {
        this.account = new Account();
        this.transactionProcessor = new TransactionProcessor();
    }

    public void createAccount(String owner, double initialBalance) {
        account.createAccount(owner, initialBalance);
    }

    public void closeAccount(int accountNumber) {
        account.closeAccount(accountNumber);
    }

    public void deposit(int accountNumber, double amount) {
        transactionProcessor.deposit(accountNumber, amount);
    }

    public void withdraw(int accountNumber, double amount) {
        transactionProcessor.withdraw(accountNumber, amount);
    }
}
