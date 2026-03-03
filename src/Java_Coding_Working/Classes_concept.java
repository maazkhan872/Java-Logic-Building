package Java_Coding_Working;

/*
 * Note: 
 
What is a Class?

A class is a blueprint/template for creating objects.
It defines:

Variables (state)
Methods (behavior)

🔹 Syntax
class ClassName {
    // variables
    // methods
}

What is an Object?

An object is an instance of a class.
Memory is allocated when object is created.

🔹 Syntax
ClassName obj = new ClassName();

Each object has:

Its own copy of instance variables
Shared copy of static variables

Multiple Classes in Same File

Allowed, but:
Only ONE class can be public
File name must match public class
*/
public class Classes_concept {

	    String name;
	    int age;

	    void display() {
	        System.out.println(name + " is " + age + " years old.");
	    }
	    public static void main(String args[]) {
	    	Classes_concept c = new Classes_concept();
	    	c.name = "abc";
	    	c.age = 12;
	    	c.display();
	    	
	    			
	    }
	}

// Practise problem
class Classes_concept {

    int count;   // Instance variable (separate for each object)

    void increment() {
        count++;
    }

    void display() {
        System.out.println("Count value: " + count);
    }

    public static void main(String[] args) {

        Counter c1 = new Counter();   // Object 1
        Counter c2 = new Counter();   // Object 2

        // Increment c1 twice
        c1.increment();
        c1.increment();

        // Increment c2 once
        c2.increment();

        System.out.println("Counter 1:");
        c1.display();

        System.out.println("Counter 2:");
        c2.display();
}
}

// Practise problem
class Classes_concept {

    String name;
    static String company = "ABC Corp";   // Shared by all objects

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name + ", Company: " + company);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Ali");
        Employee e2 = new Employee("Sara");
        Employee e3 = new Employee("Ahmed");

        // Display before change
        System.out.println("Before changing company:");
        e1.display();
        e2.display();
        e3.display();

        // Change company once
        Employee.company = "XYZ Ltd";

        System.out.println("\nAfter changing company:");
        e1.display();
        e2.display();
        e3.display();
    }
}

// Practise problem
public class Classes_concept {

    String title;
    double price;

    // Constructor
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", 1500.0);
        Book b2 = new Book("Python Fundamentals", 2000.0);

        b1.display();
        b2.display();
    }
}

