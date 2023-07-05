
/**
 * Write a program to create an abstract base class Account with 3 members account holder name, account number and balance amount.
 * Provide constructor to initialize data members, function to deposit cash to account and an abstract function, withdraw.
 * Create two child classes Saving Account and Current Account of Account class.
 * Override abstract function withdraw in child classes as per the criteria, for savings maintain a
 * minimum balance 1000 and for current account, one can withdraw 5% of current balance as
 * overdraft amount. Illustrate the above as a menu driven program.
 */

import java.util.Scanner;

abstract class Account {
    String name;
    int accNo;
    double balance;

    Account(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }

    abstract void withdraw(double amount);
}

class SavingsAccount extends Account {
    SavingsAccount(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Withdraw successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }

    @Override
    void withdraw(double amount) {
        if (1.05 * balance - amount >= 0) {
            balance -= amount;
            System.out.println("Withdraw successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Savings Account-----");
        System.out.print("Enter the name : ");
        String name = scanner.nextLine();
        System.out.print("Enter the account number : ");
        int accNo = scanner.nextInt();
        System.out.print("Enter the initial balance : ");
        double balance = scanner.nextDouble();
        Account savingsAccount = new SavingsAccount(name, accNo, balance);
        scanner.nextLine();
        System.out.println("-----Current Account-----");
        System.out.print("Enter the name : ");
        name = scanner.nextLine();
        System.out.print("Enter the account number : ");
        accNo = scanner.nextInt();
        System.out.print("Enter the initial balance : ");
        balance = scanner.nextDouble();
        Account currentAccount = new CurrentAccount(name, accNo, balance);

        System.out.println("\n-----Account Creation Successful-----\n");

        boolean isRunning = true;
        System.out.println("-----Main Menu-----");
        System.out.println("1. Deposit to Savings Account");
        System.out.println("2. Deposit to Current Account");
        System.out.println("3. Withdraw from Savings Account");
        System.out.println("4. Withdraw from Current Account");
        System.out.println("5. Display Savings Account Details");
        System.out.println("6. Display Current Account Details");
        System.out.println("7. Exit");
        System.out.println("--------------------------------------------------");
        while (isRunning) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit to Savings Account: ");
                    double savingsDepositAmount = scanner.nextDouble();
                    savingsAccount.deposit(savingsDepositAmount);
                    System.out.println("Deposit successful!");
                    break;
                case 2:
                    System.out.print("Enter amount to deposit to Current Account: ");
                    double currentDepositAmount = scanner.nextDouble();
                    currentAccount.deposit(currentDepositAmount);
                    System.out.println("Deposit successful!");
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw from Savings Account: ");
                    double savingsWithdrawAmount = scanner.nextDouble();
                    savingsAccount.withdraw(savingsWithdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw from Current Account: ");
                    double currentWithdrawAmount = scanner.nextDouble();
                    currentAccount.withdraw(currentWithdrawAmount);
                    break;
                case 5:
                    System.out.println("\n-----Savings Account Details-----");
                    savingsAccount.display();
                    break;
                case 6:
                    System.out.println("\n-----Current Account Details-----");
                    currentAccount.display();
                    break;
                case 7:
                    isRunning = false;
                    System.out.println("Thank you for using our services.");
                    break;
                default:
                    System.out.println("Please provide a valid choice!");
            }
            System.out.println("--------------------------------------------------");
        }
        scanner.close();
    }
}

/**
 * ___Output___
 * $ javac AccountMain.java
 * $ java AccountMain
 * -----Savings Account-----
 * Enter the name : Nandhu
 * Enter the account number : 123456
 * Enter the initial balance : 10000
 * -----Current Account-----
 * Enter the name : John
 * Enter the account number : 654321
 * Enter the initial balance : 100000
 * 
 * -----Account Creation Successful-----
 * 
 * -----Main Menu-----
 * 1. Deposit to Savings Account
 * 2. Deposit to Current Account
 * 3. Withdraw from Savings Account
 * 4. Withdraw from Current Account
 * 5. Display Savings Account Details
 * 6. Display Current Account Details
 * 7. Exit
 * --------------------------------------------------
 * Enter your choice: 1
 * Enter amount to deposit to Savings Account: 1000
 * Deposit successful!
 * --------------------------------------------------
 * Enter your choice: 2
 * Enter amount to deposit to Current Account: 10000
 * Deposit successful!
 * --------------------------------------------------
 * Enter your choice: 3
 * Enter amount to withdraw from Savings Account: 5000
 * Withdraw successful!
 * --------------------------------------------------
 * Enter your choice: 4
 * Enter amount to withdraw from Current Account: 50000
 * Withdraw successful!
 * --------------------------------------------------
 * Enter your choice: 5
 * 
 * -----Savings Account Details-----
 * Name: Nandhu
 * Account Number: 123456
 * Balance: 6000.0
 * --------------------------------------------------
 * Enter your choice: 6
 * 
 * -----Current Account Details-----
 * Name: John
 * Account Number: 654321
 * Balance: 60000.0
 * --------------------------------------------------
 * Enter your choice: 7
 * Thank you for using our services.
 * --------------------------------------------------
 */