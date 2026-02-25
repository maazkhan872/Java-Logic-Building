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
}


// Sum of two elements
public class Array {
	
	public static void main(String args[]) {
		
		int arr[] = {2, 3 , 5, 4 , 7};
		
		int target = 9;
		
		for (int i = 0; i < arr.length ;i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("Sum of two elements are: " + arr[i] + " and " + arr[j]);
				}
			} 
		}
	}
}

// maximum element
public class Array {
	
	public static void main(String args[]) {
		
		int arr[] = {12, 7, 9, 45, 89};
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximun is: " + max);
	}
}

// Minimum element
public class Array {
	
	public static void main(String args[]) {
		
		int arr[] = {12, 7, 9, 45, 89};
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maximun is: " + min);
	}
}

// reverse array
public class Array {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		
		for (int i = arr.length - 1; i>=0; --i) {
			System.out.println(arr[i]);
		}
	}
}

// Even and Odd Problem
public class Array {
	
	public static void main (String args[]) {
		int arr[] = {12, 7, 9, 45, 89};
		
		for (int i = 0; i < arr.length; i++) {
		if (arr[i] % 2 == 0) {
			System.out.print(arr[i] + " Number is even ");
		}
		else {
			System.out.print(arr[i] + " Number is odd ");
		}
		}
	}
}

// Specific element found
public class Array {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40};

        int search = 30;

        boolean found = false;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == search) {

                found = true;

                break;

            }
        }

        if(found)

            System.out.println("Element Found");

        else

            System.out.println("Element Not Found");

    }
} 

// Count even Number
public class Array {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,8};

        int count = 0;

        for(int num : arr) {

            if(num % 2 == 0)

                count++;
        }
        
        System.out.println("Even count is: " + count);

    }
}

// sort elements
public class Array {

    public static void main(String[] args) {

        int arr[] = {5,3,8,1};

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] > arr[j]) {

                    int temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;

                }

            }

        }

        for(int num : arr)

            System.out.print(num + " ");

    }
}


// Find Second Largest Element
public class Array {

    public static void main(String[] args) {

        int[] arr = {10,20,5,8,30};

        int first = arr[0];

        int second = arr[0];

        for(int num : arr) {

            if(num > first) {

                second = first;

                first = num;

            }

            else if(num > second && num != first) {

                second = num;

            }

        }

        System.out.println("Second largest is: " + second);

    }

}

