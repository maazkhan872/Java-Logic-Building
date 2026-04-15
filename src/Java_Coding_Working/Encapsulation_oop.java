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


class Encapsulation_oop {

    //  private data (hidden)
    private String username;
    private String email;
    private String password;

    // constructor
    public Encapsulation_oop(String username, String email, String password) {
        this.username = username;
        setEmail(email);        // use setter validation
        setPassword(password);  // use setter validation
    }

    // getter (read-only where needed)
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    // No getter for password (security)

    // controlled setter for email
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format!");
        }
    }

    // controlled setter for password
    public void setPassword(String password) {
        if (password != null && password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters!");
        }
    }

    //  method to verify password (real-world pattern)
    public boolean login(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}