
package Java_Coding_Working;

/*
// Just Print 
public class firstclass {
     public static void main(String args[]) {
    	 System.out.println("Welcome back to Java Course"); 
     }
}
*/

/*
 * Implicit casting (Automatically performed by compiler)
public class firstclass {
    public static void main(String args[]) {
    	
    	int x = 10;
    	double y = x;
   	 System.out.println("The value of y is:");
   	 System.out.println(y);
    }
} */

/*
 * Explicit casting (manual happen)
 
public class firstclass {
    public static void main(String args[]) {
    	
    	double x = 10.00;
    	int y = (int) x;
   	 System.out.println("The value of y is:");
   	 System.out.println(y);
    }
}*/

/*
 * Arithmetic Operator
public class firstclass {
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
}*/

/*
 * Class and Object
public class firstclass {
	
	int a = 34;
	String n = "abc";
	
	public void add() {
		System.out.println("Here is a inside methods");
	}
	
    public static void main(String args[]) {
   	 firstclass f1 = new firstclass();
   	 f1.add();
   	 System.out.println(f1.a);
   	 System.out.println(f1.n);
    }
}*/


/*
 //multiclasses 
public class firstclass {  
	
	int a = 34;
	String n = "abc";
	
	public void add() {
		System.out.println("Here is a inside methods");
	}
	
    public static void main(String args[]) {
   	 firstclass f1 = new firstclass();
   	 f1.add();
   	 System.out.println(f1.a);
   	 System.out.println(f1.n);
   	 multi_class f2 = new multi_class();
   	 f2.sub();
    }
}*/

/*
class second_class {  
	
	int a = 34;
	String n = "abc";
	
	public void add() {
		System.out.println("Here is a inside methods");
	}
	
}
 public class firstclass {
	
    public static void main(String args[]) {
   	 second_class f1 = new second_class();
   	 f1.add();
   	 System.out.println(f1.a);
   	 System.out.println(f1.n);
   	 
    }
}*/

/*
 * Method use
public class firstclass {
	
//	public void add() {
	//	int x = 5 + 8;
	//	System.out.println("the value of x is after add " + x);
		//}
	
	public int add() {
		int x = 5 + 6;
		return x;
	}
	
	public static void main (String args[]) {
		firstclass f = new firstclass();
		int y =f.add();
		//System.out.println("the value of x is " + f.add());
		System.out.println("the value of x is " + y);
	}
}*/

/*
 * method with parameter
public class firstclass{
	
	public int add (int a, int b) {
		int x = a + b;
		return x;
	}
	public static void main(String args[]) {
		firstclass f = new firstclass();
		
		System.out.println("The value of x is " + f.add(3, 5));
	}
}*/

/*
 * Method with multiple parameter
public class firstclass{
	
	public String function (String city_name, String city_code) {
	//	System.out.println("The name of city is " + city_name);
	//	System.out.println("The code of city is " + city_code);
		return "The name of city is " + city_name + " and code is " + city_code;
		
	}
	public static void main(String args[]) {
		firstclass f = new firstclass();
		
	//	f.function("Karachi", 75107);
		System.out.println(f.function("Karachi", "75106"));
	}
}*/

/*
 // Access static using main class
public class firstclass{
	
	public static void function () {
		System.out.println("This is a static method ");
	}
	
	public void functions () {
		System.out.println("This is a non-static method ");
	}
	
	public static void main(String args[]) {
		firstclass f = new firstclass();
		firstclass.function();  // we can call it by reference variable
		f.functions();
	} 
	
}*/

/*
 // Differnt static classes
class secondclass {
	static void functionss() {  // another class has static function but it will not directly call by previous class
		System.out.println("This is a static method ");
	}
}

public class firstclass{
	
	int a =10;  // static method can not access non-static variable
	static int b = 12;
	
	public static void function () {
		System.out.println("This is a static method " + b);
	}
	
	public void functions () {
		System.out.println("This is a non-static method " + b );
	}
	
	public static void main(String args[]) {
		firstclass f = new firstclass();
		f.function();
		f.functions();
		secondclass.functionss();
	}	
}*/

/*
 * Method Overloading
public class firstclass{
	
	public double area(double r) {
		return Math.PI*r*r;
	} 
	
	double circleCircumference(double r) {
	    return 2 * Math.PI * r;
	}
	
	public int area (int length, int breadth) {
		return length * breadth;
	}
	 
	int rectanglePerimeter(int l, int b) {
	    return 2 * (l + b);
	}
	
	public static void main(String args[]) {
		firstclass f = new firstclass();
		System.out.println("The value of circle area is " + f.area(8.0));
		System.out.println("The value of circle perimeter is " + f.area(9.0));
		System.out.println("The value of rectangle area is " + f.area(8, 7));
		System.out.println("The value of rectangle perimeter is " + f.area(4, 3));
	}
}*/

/*
public class firstclass{
	
	int x;
	public void display(int x) {
		this.x = x;
	}
	
	public static void main (String args[]) {
		firstclass f = new firstclass();
		f.display(12);
		System.out.println("the value of x is " + f.x);
	}
}*/

/*
 * this example
class BankAccount {

    private String accountHolder;
    private double balance;

    public void setAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder; // object variable
        this.balance = balance;             // object variable
    }

    public void showDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccount("Maaz Khan", 50000);
        acc.showDetails();
    }
}*/


/*
 * Scope of Variable (Local variable)
public class firstclass {
	
    public void show() {
        int x = 10; // local variable
        System.out.println("Local x " + x);
    }
    
    public static void main(String[] args) {
        firstclass e = new firstclass();
        e.show();
     //   System.out.println(x); // ❌ Error: x not visible here
    }
}*/

/*
 * Instance variable
class firstclass {
    int a = 5; // instance variable
    
    public void display() {
        System.out.println("Instance a = " + a);
    }
    
    public static void main(String[] args) {
        firstclass e = new firstclass();
        e.display();
    }
}*/


/*
 * static variable
class firstclass {
    static int count = 0; // static variable
    
    public void increment() {
        count++;
    }
    
    public static void main(String[] args) {
        firstclass e1 = new firstclass();
        firstclass e2 = new firstclass();
        e1.increment();
        e2.increment();
        System.out.println("Static count = " + firstclass.count); // 2
    }
}*/

/*
 * if else problem
public class firstclass {
	
	int age;
	double  monthlyincome;
	int creditscore;
	boolean hasloandefault;
	
	public void loanchecker() {
		
		if (age >= 21 && monthlyincome >= 50000 && creditscore >= 700 && !hasloandefault) {
			System.out.println("Load Approaved");
		}
		else {
			System.out.println("Loan Rejected");
		}		
	}
	
	public static void main(String args[]) {
		firstclass f = new firstclass();
		f.age = 22;
		f.monthlyincome = 60000;
		f.creditscore = 800;
		f.hasloandefault = false;
		
		f.loanchecker();
		
	}
}
*/


/*
class LoanApproval {

    int age;
    double monthlyIncome;
    int creditScore;
    boolean hasLoanDefault;

    // Constructor
    public LoanApproval(int age, double monthlyIncome,
                        int creditScore, boolean hasLoanDefault) {

        this.age = age;
        this.monthlyIncome = monthlyIncome;
        this.creditScore = creditScore;
        this.hasLoanDefault = hasLoanDefault;

        // validation logic
        if (age >= 21 && monthlyIncome >= 50000
                && creditScore >= 700
                && !hasLoanDefault) {

            System.out.println("Loan Approved");

        } else {
            System.out.println("Loan Rejected");
        }
    }

    public static void main(String[] args) {
        LoanApproval loan = new LoanApproval(25, 60000, 720, false);
    }
}
*/

/*
 * if - else 
public class firstclass{
	
	boolean isactive;
	int experienceyears;
	int performance_rating;
	
	public void performance_check() {
		
		if(!isactive) {
		if (experienceyears >= 5) {
			if (performance_rating >= 4) {
				System.out.println("Promotion Approved");
			}
			else {
				System.out.println("Improve Performance");
				}
		}
			else {
				System.out.println("Not Enough Experience");
			}
			}
		else {
			System.out.println("Employee Not Active");
		}
		}
			
	public static void main(String[] args) {

        firstclass emp = new firstclass();

        emp.isactive = true;
        emp.experienceyears = 6;
        emp.performance_rating = 4;

        emp.performance_check();
    }

}*/

/*
 * else-if ladder
class firstclass {

    int riskScore = 78;

    public void classifyRisk() {

        if (riskScore >= 90) {
            System.out.println("Very High Risk");

        } else if (riskScore >= 70) {
            System.out.println("High Risk");

        } else if (riskScore >= 50) {
            System.out.println("Medium Risk");

        } else if (riskScore >= 30) {
            System.out.println("Low Risk");

        } else {
            System.out.println("Very Low Risk");
        }
    }

    public static void main(String[] args) {

        firstclass customer = new firstclass();
    //    customer.riskScore = 72;

        customer.classifyRisk();
    }
}*/


/*
 * Switch
class firstclass {

    String role = "ADMIN";

    public void assignAccess() {

        switch (role) {

            case "ADMIN":
                System.out.println("Full Access Granted");
                break;

            case "MANAGER":
                System.out.println("Limited Admin Access");
                break;

            case "EMPLOYEE":
                System.out.println("Standard Access");
                break;

            case "INTERN":
                System.out.println("Read-Only Access");
                break;

            default:
                System.out.println("No Access");
        }
    }

    public static void main(String[] args) {

    	firstclass user = new firstclass();


        user.assignAccess();
    }
}*/

/*
public class firstclass {

	String customerType = "PREMIUM";

    public void calculateDiscount() {

        int discount = customerType.equals("PREMIUM") ? 20 : 5;

        System.out.println("Discount Applied: " + discount + "%");
    }

    public static void main(String[] args) {

        firstclass customer = new firstclass();

        customer.calculateDiscount();
    }
}
*/

// Loop Concepts
// While Loop
public class firstclass{
	
	public static void main(String args[]) {
	
	int i = 1;
	int sum = 0;
	
	while (i<10) {
		
	}
			
			
}
}

