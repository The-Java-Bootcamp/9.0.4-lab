package academy.javapro.lab;

class BankAccount {
    private String accountNumber;
    private double balance;
    private String pin;

    public BankAccount(String accountNumber, double initialBalance, String pin) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.pin = pin;
    }

    // TODO: Implement deposit, withdraw, checkBalance, and validatePin methods
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}
