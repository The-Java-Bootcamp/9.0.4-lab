# Lab: 9.0.4

**Objective:**

- Understand the concept and importance of Try and Catch Blocks in Java development.
- Learn how to implement Try and Catch Blocks using Java's exception handling mechanism.
- Explore practical applications of Try and Catch Blocks in a simulated ATM system.
- Identify common pitfalls and best practices when working with exception handling.
- Gain hands-on experience with a complete Java example that demonstrates Try and Catch Blocks in an interactive
  context.

**Prerequisites:**

- Basic understanding of Java programming.
- Familiarity with Java control structures (if-else, loops).
- Understanding of Java methods and basic object-oriented programming concepts.
- Basic knowledge of user input handling in Java.

**What You'll Achieve:**

- Develop a solid understanding of exception handling in Java.
- Implement practical examples that simulate real-world ATM operations.
- Enhance your skills in writing robust and error-resistant Java code.
- Learn to handle user input and potential errors in an interactive application.

**Assignment Details**

In this assignment, you will create a simple ATM simulation that demonstrates the use of Try and Catch Blocks. Your task
is to implement an `ATM` class that interacts with a `BankAccount` class, allowing users to perform various banking
operations.

1. Create a `BankAccount` class with the following properties:
    - `accountNumber` (String)
    - `balance` (double)
    - `pin` (String)
2. Implement the following methods in the `BankAccount` class:
    - `deposit(double amount)`: Adds the specified amount to the balance.
    - `withdraw(double amount)`: Subtracts the specified amount from the balance.
    - `checkBalance()`: Returns the current balance.
    - `validatePin(String enteredPin)`: Checks if the entered PIN matches the account PIN.
3. Create an `ATM` class that simulates ATM operations:
    - Implement a method `start()` that initiates the ATM session.
    - Use a loop to continuously prompt the user for operations until they choose to exit.
    - Implement methods for withdrawal, deposit, and balance inquiry.
4. Use Try and Catch Blocks to handle the following exceptions:
    - `IllegalArgumentException`: Throw this when a negative amount is provided for deposit or withdrawal.
    - `InsufficientFundsException`: Create this custom exception and throw it when a withdrawal amount exceeds the
      current balance.
    - `InvalidPinException`: Create this custom exception and throw it when an incorrect PIN is entered.
    - `InputMismatchException`: Catch this to handle invalid user input (e.g., entering text instead of a number).
5. In the `main` method, demonstrate the use of your `ATM` class:
    - Create a new bank account with an initial balance and PIN.
    - Create an ATM instance and start the ATM session.
    - Use Try and Catch Blocks to handle potential exceptions throughout the ATM operations.
    - Print appropriate error messages when exceptions occur.
6. Implement a `finally` block to display a message after each transaction attempt, regardless of success or failure.

**Example Output**

```
Welcome to the ATM
Enter your PIN: 1234
1. Withdraw
2. Deposit
3. Check Balance
4. Exit
Enter your choice: 2
Enter amount to deposit: 500
Successfully deposited $500.0
Current balance: $1500.0

1. Withdraw
2. Deposit
3. Check Balance
4. Exit
Enter your choice: 1
Enter amount to withdraw: 2000
Error: Insufficient funds for withdrawal

1. Withdraw
2. Deposit
3. Check Balance
4. Exit
Enter your choice: 3
Current balance: $1500.0

1. Withdraw
2. Deposit
3. Check Balance
4. Exit
Enter your choice: 4
Thank you for using the ATM. Goodbye!
```

**Starter Code**

The `ATM.java` and `BankAccount.java` files contains the following starter code:

```java
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
```

```java
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
```

**Hints**

- Use a `do-while` loop in the `start()` method to keep the ATM session running until the user chooses to exit.
- Remember to close the Scanner when the ATM session ends to prevent resource leaks.
- Use nested Try and Catch Blocks to handle different types of exceptions that may occur during user input and ATM
  operations.
- Consider using a separate method for input validation to keep your code clean and modular.
- Don't forget to handle potential `InputMismatchException` when parsing user input for menu choices and transaction
  amounts.

**Submission Instructions**

1. Fork the repository
2. Clone your fork
3. Navigate into the repository
4. Implement the required methods in both `ATM` and `BankAccount` classes
5. Test your implementation with various inputs
6. Git add, commit, and push to your fork
7. Submit a pull request
    - Set the title of the pull request to your first name and last name
    - In the comment, briefly explain your implementation approach and any challenges you faced

Remember, the goal is to learn and have fun! Don't hesitate to ask for help if you get stuck.