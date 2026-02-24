//package Java_Coding_Working;

public class Loops {

	public static void main(String args[]) {
		
		int i = 1;
		while(i<5) {
			System.out.println("Java is a Powerful Programming Language");
			i++;
		}
		
	}
}

public class Loops {
	
	public static void main (String args[]) {
		int i = 1;
		int sum = 0;
		
		while(i<10) {
			sum = sum + i; // 0 + 1 = 1, 1 + 2 = 3
			i++;   // 1 + 1 = 2, 2 + 1 = 3
		}
		System.out.println("Sum is " + sum);
	}
}


public class Loops{
	public static void main(String args[]) {
	
		int i = 15;
		do {
                 System.out.println("Program is running");			
                 i--;
		}while(i>10);
	}
}



 // Reverse
 
public class Loops{
	
	public static void main (String args[]) {
		
	//	int i;
		for (int i = 20; i>10 ; i--) {
			System.out.println("Runnning" + i);
		}
	}
}



public class Loops{
	
	public static void main (String args[]) {
		
	//	int i;
		for (int i =0; i<10 ; i++) {
			System.out.println("Runnning" + i);
		}
	}
}



public class Loops {
	
	public static void main(String args[]) {
		
		int sum = 0;
		for(int i = 0; i <11; i++) {
			if (i%2 == 0)
			sum = sum + i;
		}
		System.out.println("sum is " + sum);
	}
	
}


// For Loop with break
public class Loops {
	
	public static void main(String args[]) {
		
		for(int i = 0; i <11; i++) {
			if (i == 5)
			break;
			System.out.println(i);
			
		}
		System.out.println("after loop");
	}
}


// For Loop with Continue Statement
public class Loops {
	
	public static void main(String args[]) {
		
		for(int i = 0; i <11; i++) {
			if (i == 5)
			break;
			System.out.println(i);
			
		}
		System.out.println("after loop");
	}
}


 // Recursion
public class Loops {
		
		public int factorial(int number) {
			int f = 1;
			if (number == 1)
				return 1;
			else {
				f = number * factorial(number - 1);
			}
			return f;
		}
		
		public static void main (String args[]) {
			Loops l = new Loops();
			
			int m =l.factorial(10);
			System.out.println("Factorial of number is " + m);
	}
} 

public class Loops {

    public int variable_args(int ... args) {

        System.out.println("argument length " + args.length);

        int sum = 0;

        for (int x : args) {
            sum = sum + x;
        }

        return sum;
    }

    public static void main(String args[]) {

        Loops l = new Loops();

        int result = l.variable_args(10, 20);

        System.out.println("Sum is " + result);
        
        int result1 = l.variable_args(10, 20, 30);

        System.out.println("Sum is " + result1);

    }
}

// Loop Concepts
// While Loop
public class Loops{
	
	public static void main(String args[]) {
	
	int i = 1;
	int sum = 0;
	
	while (i<10) {
		
	}
			
			
}
}