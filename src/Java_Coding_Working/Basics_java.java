package Java_Coding_Working;

/*
Note: 
	Keywords are reserved words in Java that have predefined meaning and cannot be used as variable names.

	Java has 50+ reserved keywords like:
	class, public, static, void, int, if, else, return, new, this, etc.
	

    ❌ Invalid Example
    int class = 10;   // Error (class is a keyword)
    
    Valid Example
    public class Test {
       int number = 10;
    }
    
    Identifiers are names given to:

    1. Variables
    2. Methods
    3. Classes
    4. Objects
    
    Example
    int age = 25;
    String studentName = "Ali";
    ❌ Invalid
    int 1age = 10;   // Cannot start with number
*/

//Just Print 
public class Basics_java {
  public static void main(String args[]) {
 	 System.out.println("Welcome back to Java Course"); 
  }
}

// Variables
public class Basics_java {

	    int instanceVar = 10;      // Instance variable
	    public static int staticVar = 20; // Static variable

	    public static void main(String[] args) {
	        int localVar = 5;      // Local variable
	        System.out.println(localVar);
	        System.out.println(Basics_java.staticVar);
	    }
	}

// Implicit casting (Automatically performed by compiler)
public class basics_java{
    public static void main(String args[]) {
    	
    	int x = 10;
    	double y = x;
   	 System.out.println("The value of y is:");
   	 System.out.println(y);
    }
} 

// practise problem
public class Basics_java {

    static int x = 10;

    public static void main(String[] args) {
        Test1 obj1 = new Test1();
        Test1 obj2 = new Test1();

        obj1.x = 20;
        System.out.println(obj2.x);
    }
}

// practise_problem
public class Basics_java {
    public static void main(String[] args) {

        int a = 5;
        int b = a++ + ++a;

        System.out.println(a);
        System.out.println(b);
    }    // b = 5 + 7 = 12,  a = 7
}    

// type casting
public class Basics_java {
    public static void main(String[] args) {

        int a = 130;
        byte b = (byte) a;

        System.out.println(b);
    }  // Byte range: -128 to 127, 130 is outside range → overflow occurs, Binary overflow happens → result becomes: -126
}

 // Explicit casting (manual happen)
public class Basics_java {
    public static void main(String args[]) {
    	
    	double x = 10.00;
    	int y = (int) x;
   	 System.out.println("The value of y is:");
   	 System.out.println(y);
    }
}

// Integer Division
public class Basics_java {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        double result = (double) a / b;

        System.out.println(result);
    }
}

// Operator Precedence
public class Basics_java {
    public static void main(String[] args) {

        int result = 10 + 20 * 3 - 5 / 5;

        System.out.println(result);
    }  // output = - 69
}

// Compound Assignment
public class Basics_java {
    public static void main(String[] args) {

        int a = 10;
        a += a -= 5;

        System.out.println(a);
    }
} // a -= 5  → a = 5, a += 5  → a = 10

// Arithmetic Operator
public class Basics_java {
    public static void main(String args[]) {
    	
    	int a = 5;
    	int b = 2;
    	int c = a + b;
    	System.out.println(c);
    	c = a - b;
    	System.out.println(c);
    	c = a * b;
    	System.out.println(c);
    	c = a / b;
    	System.out.println(c);
    	c = a % b;
    	System.out.println(c);
    }
}

// Floating Precision
public class Basics_java {
    public static void main(String[] args) {

        System.out.println(0.1 + 0.2);
    }
}

// logical opoerator
public class Basics_java {
    public static void main(String[] args) {

        int a = 5;

        if (a > 10 && ++a > 6) {
            System.out.println("Inside");
        }

        System.out.println(a);
    }
}


