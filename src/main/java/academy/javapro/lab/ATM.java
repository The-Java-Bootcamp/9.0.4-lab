package academy.javapro.lab;

import java.util.Scanner;

public class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the ATM");
        // TODO: Implement PIN validation
        // TODO: Implement main ATM loop with operation choices
    }

    // TODO: Implement withdraw, deposit, and checkBalance methods

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 1000.0, "1234");
        ATM atm = new ATM(account);
        atm.start();
    }
}
