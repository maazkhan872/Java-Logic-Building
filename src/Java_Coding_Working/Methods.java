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