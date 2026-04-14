package Java_Coding_Working;

/*
Note:
First Pillar of OOP: Encapsulation
"Wrapping data (variables) and methods (functions) into a single unit (class) and restricting direct access to some of the object’s components"
"Hide internal details and control access through methods”

How Encapsulation Works in Code:
We achieve encapsulation using:

1. private variables (data hiding)
2. public getter/setter methods (controlled access)
*/


public class Encapsulation_oop {

    // hidden data (Encapsulation)
    private double balance;

    // constructor
    public Encapsulation_oop(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // ✅ deposit method (controlled access)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // withdraw method (controlled access)
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // read-only access
    public double getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {

    	Encapsulation_oop account = new Encapsulation_oop(1000);

        account.deposit(500);
        account.withdraw(300);

        System.out.println("Current Balance: " + account.getBalance());

        // NOT allowed (because of encapsulation)
        // account.balance = -9999;
    }
}