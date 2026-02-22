package Java_Coding_Working;

/*
// Default Constructor
public class Java_oop_constructors {

	String name;
	int age;
	
	Java_oop_constructors (){
		this.name = "ABC";
		this.age = 23;
		

		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main (String args[]) {
		Java_oop_constructors jj = new Java_oop_constructors ();
		
	
		
	}
} 


// Parametrized Contstructor
public class Java_oop_constructors {

	String name;
	int age;
	
	Java_oop_constructors (String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("The name is " + name);
		System.out.println("The age is " + age);
	}
	
	public static void main (String args[]) {
		Java_oop_constructors jj = new Java_oop_constructors ("ABC", 23);
		jj.display();
		
	}
}



// Copy Constructor
public class Java_oop_constructors {

	String name;
	int age;
	
	Java_oop_constructors (String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Java_oop_constructors(Java_oop_constructors s){
	       this.name = s.name;
	       this.age = s.age;
	}
	
	public void display() {
		System.out.println("The name is " + name);
		System.out.println("The age is " + age);
	}
	
	public static void main (String args[]) {
		Java_oop_constructors jj = new Java_oop_constructors ("ABC", 23);
		Java_oop_constructors jj2 = new Java_oop_constructors(jj);
		jj.display();
		jj2.display();
		
	}
}

// Practise Question
class Java_oop_constructors {

    String accountHolder;
    int accountNumber;
    double balance;

    // Default constructor
    Java_oop_constructors() {

        this.accountHolder = "ABC";
        this.accountNumber = 0322;
        this.balance = 550.00;

    }

    // Parameterized constructor
    Java_oop_constructors(String accountHolder, int accountNumber, double balance) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    void display() {

        System.out.println("Name: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);

    }

    public static void main(String args[]) {

    	Java_oop_constructors a1 = new Java_oop_constructors();

    	Java_oop_constructors a2 = new Java_oop_constructors("Maaz", 12345, 50000);

        a1.display();

        a2.display();

    }

}*/