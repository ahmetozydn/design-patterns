package org.patterns.facade.pattern;

// Client
public class Main {
    public static void main(String[] args) {
        BankFacade bank = new BankFacade();

        bank.createAccount("John Doe", 1000);
        bank.deposit(1, 500);
        bank.withdraw(1, 200);
        bank.closeAccount(1);
    }
}
