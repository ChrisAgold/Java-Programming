package ConstructorsExercise;

public class Accounts {
    private String number;
    private double balance;
    private String customerPhoneNumber;
    private String customerName;
    private String customerEmail;

    // Create Constructor for account
    public Accounts() {

        // this is calling a constructor inside a constructor, set default values
        this("56789", 2.50, "Default name", "Default address", "default phone");
        System.out.println("Empty Constructor called");
    }

    // Constructor to change parameters
    public Accounts(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");

        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }


    // deposit method
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    // withdrawal method
    public void withdrawal(double withdrawalAmount) {
        // Check if enough funds in account
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }


    // Getters & Setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}

