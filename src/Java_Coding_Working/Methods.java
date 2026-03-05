package Java_Coding_Working;


// creating a method
public class Methods {
	
	static void greet() {
        System.out.println("Hello, welcome to Java!");
    }

    public static void main(String[] args) {
        greet(); // method call
    }
}

// void means the method does not return any value.
public class Methods {

    static void showMessage() {
        System.out.println("This method returns nothing");
    }

    public static void main(String[] args) {
        showMessage();
    }
}

// Method Returning Value (Not Void)
public class Methods {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println(result);
    }
}

// Parameter: Variable in method definition.
// Argument: Actual value passed when calling method.

public class Methods {

    static void greet(String name) { // parameter
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {

        greet("Maaz"); // argument
    }
}

//Multiple Parameters: A method can take multiple inputs.
public class Methods {

    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        int result = multiply(4, 5);
        System.out.println(result);
    }
}

// Class Methods: Static vs Non-Static
// Belongs to class, not object. Called using class name.

public class Methods {

    static void display() {
        System.out.println("It is a Static method");
    }

    public static void main(String[] args) {
        Methods.display();
    }
} 

//Non-Static Method: Belongs to object. Requires object creation.

public class Methods {

 void show() {
     System.out.println("it is a Non-static method");
 }

 public static void main(String[] args) {

     Methods obj = new Methods();
     obj.show();
 }
} 

// Method Overloading: Method overloading means same method name but different parameters.
public class Methods {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

Methods obj = new Methods();

        System.out.println(obj.add(2,3));
        System.out.println(obj.add(2,3,4));
        System.out.println(obj.add(2.5,3.5));
    }
} 

// this Keyword: this refers to the current object.
public class Methods {

    String name;

    Methods(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("My name is: " + name);
    }

    public static void main(String[] args) {

        Methods s1 = new Methods("Maaz Khan");
        s1.display();
    }
} 

// Scope of Variables: Scope means where a variable can be accessed.
// Two important scopes: Block Scope, Method Scope

// Block Scope: Variable accessible only inside the block {}.

// Method Scope: Variable accessible only inside that method.

public class Methods {

    static void show(){
        int num = 5;
        System.out.println(num);
    }

    public static void main(String[] args) {
        show();
    }
} 

// Method Return
public class Methods {

    // Method that returns square
    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        int result = square(4);  // method call

        System.out.println("Output: " + result);
    }
} 

// Multiple Parameters
public class Methods {

    // Method with multiple parameters
    static int max(int a, int b, int c) {

        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        return largest;
    }

    public static void main(String[] args) {

        int result = max(4, 9, 2);  // method call

        System.out.println("Output: " + result);
    }
}  


public class Methods {

    static int count = 0;   // static variable

    void increment() {     // non-static method
        count++;
    }

    void display() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {

        Methods c1 = new Methods();
        Methods c2 = new Methods();
        Methods c3 = new Methods();

        c1.increment();
        c2.increment();
        c3.increment();

        c1.display();
        c2.display();
        c3.display();
    }
} 

public class Methods {

    String brand;
    int price;

    // Constructor using this keyword
    Methods(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

    	Methods c1 = new Methods("Toyota", 2000000);
    	Methods c2 = new Methods("Honda", 1800000);

        c1.display();
        c2.display();
    }
}