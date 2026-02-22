package Java_Coding_Working;

public class Array {

	public static void main(String args[]) {
		
		int array [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("First Number is: " + array[0]);
		System.out.println("Second Number is: " + array[1]);
		System.out.println("Third Number is: " + array[2]);
		System.out.println("Fourth Number is: " + array[3]);
		System.out.println("Fifth Number is: " + array[4]);
		System.out.println("Sixth Number is: " + array[5]);
		System.out.println("Seventh Number is: " + array[6]);
		System.out.println("Eight Number is: " + array[7]);
		System.out.println("Ninth Number is: " + array[8]);
		System.out.println("Tenth Number is: " + array[9]);
		
		System.out.println("Array length is: " + array.length);
	}
}

public class Array {
	
	public static void main(String args[]) {
		
		int array [] = {20, 30, 40, 50, 60};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Numbers is: " + array[i]);
		}
	}
}


// Sum Problem
public class Array {
	
	public static void main(String args[]) {
		
		int array [] = {20, 30, 40, 50, 60};
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("Sum is: " + sum);
	}
}

// For Each-loop
public class Array {

    public static void main(String args[]) {

        int array[] = {5,10,15};

        for(int x : array) {

            System.out.println(x);

        }
    }
}

// For-Each Problem
public class Array{
	
	public static void main(String args[]) {
		 
		int marks [] = {10, 20, 30, 40, 50};
		
		for (int x : marks) {
			System.out.println("Marks is: " + x);
		}
	}
}

import java.util.Scanner;

public class Array {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int array [] = new int[6];
		
		System.out.println("Enter 6 numbers:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}
		for (int i = 0; i < array.length; i++){
		System.out.println(array[i];
		}
		
	}
}


// Sum Problem
import java.util.Scanner;

public class Array {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int array [] = new int[6];
		
		int sum = 0;
		
		System.out.println("Enter 6 numbers:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
			 sum = sum + array[i];
		}
		System.out.println("Sum is" + sum);
		
		
	}
}

// Maximum Number
import java.util.Scanner;

public class Array {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int array[] = new int[5];

        int max;

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++) {

            array[i] = sc.nextInt();

        }

        max = array[0];

        for(int i = 1; i < 5; i++) {

            if(array[i] > max) {

                max = array[i];

            }

        }

        System.out.println("Maximum is " + max);

    }
}

 // 2-D Problem
public class Array {

    public static void main(String[] args) {

        int[][] numbers = {
            {10, 20, 30},
            {40, 50, 60}
        };

        // Print
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers[i].length; j++)
            {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}

// Multi-Dimensional Problem
public class Array {

    public static void main(String[] args) {

        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int row[] : matrix)
        {
            for(int value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}*/
