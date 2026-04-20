package Java_Coding_Working;

import java.util.Scanner;
/*
Note:
First Pillar of OOP: Encapsulation
"Wrapping data (variables) and methods (functions) into a single unit (class) and restricting direct access to some of the object’s components"
"Hide internal details and control access through methods”

How Encapsulation Works in Code:
We achieve encapsulation using:

1. private variables (data hiding)
2. public getter/setter methods (controlled access)

"Encapsulation turns objects into self-governing units rather than passive data holders"

Without encapsulation:

Objects are just data containers
Any part of the code can corrupt state

With encapsulation:

Objects protect themselves
Invalid operations are blocked internally
*/

// Car Information System
class Encapsulation_oop{

    // private data
    private String brand;
    private String model;
    private int year;

    // constructor
    public Encapsulation_oop(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // getters 
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {

    	Encapsulation_oop car = new Encapsulation_oop("Toyota", "Corolla", 2020);

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        
        Encapsulation_oop car1 = new Encapsulation_oop("Honda", "Civic", 2019);
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());
    }
}

// Book Information
class  Encapsulation_oop {

    private String title;
    private String author;

    public  Encapsulation_oop(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

        public static void main(String[] args) {

        	Encapsulation_oop b = new  Encapsulation_oop("Java Basics", "maaz");

            System.out.println(b.getTitle());
            System.out.println(b.getAuthor());
            
            Encapsulation_oop b2 = new  Encapsulation_oop("Spring Boot", "Khan");
            System.out.println(b2.getTitle());
            System.out.println(b2.getAuthor());
        }
    }

// Product Price System
class Encapsulation_oop {

    private String name;
    private double price;

    public Encapsulation_oop(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // controlled setter
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be greater than 0!");
        }
    }

        public static void main(String[] args) {

        	Encapsulation_oop p = new Encapsulation_oop("Laptop", 50000);

            System.out.println(p.getName());
            System.out.println(p.getPrice());

            p.setPrice(-200); 
        }
    }


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

// User Profile Management
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

    //  method to verify password 
    public boolean login(String inputPassword) {
        return this.password.equals(inputPassword);
    }
        	
        	public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                // 🔹 taking input from user
                System.out.print("Enter Username: ");
                String username = sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                System.out.print("Enter Password: ");
                String password = sc.nextLine();

                Encapsulation_oop user = new Encapsulation_oop(username, email, password);

                // 🔹 show data
                System.out.println("\n--- User Created ---");
                System.out.println("Username: " + user.getUsername());
                System.out.println("Email: " + user.getEmail());

                // 🔹 update email
                System.out.print("\nUpdate Email: ");
                String newEmail = sc.nextLine();
                user.setEmail(newEmail);

                // 🔹 update password
                System.out.print("Update Password: ");
                String newPassword = sc.nextLine();
                user.setPassword(newPassword);

                // 🔹 login check
                System.out.print("\nEnter Password to Login: ");
                String loginPass = sc.nextLine();

                if (user.login(loginPass)) {
                    System.out.println("Login successful");
                } else {
                    System.out.println("Login failed");
                }

                sc.close();
        }
    }