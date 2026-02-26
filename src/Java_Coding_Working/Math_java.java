package Java_Coding_Working;

public class Math_java {

	
	public static void main(String[] args) {

        int result = Math.max(10, 20);
        System.out.println(result);
        
        int result1 = Math.min(5, 2);
        System.out.println(result1);

        double result2 = Math.sqrt(25);
        System.out.println(result2);
        
        double result3 = Math.pow(2, 3);
        System.out.println(result3);
        
        int result4 = Math.abs(-10);
        System.out.println(result4);
        
        long result5 = Math.round(5.6);
        System.out.println(result5);
        
        double result6 = Math.ceil(5.1);
        System.out.println(result6);
        
        double result7 = Math.floor(5.9);
        System.out.println(result7);
        
        int num = (int)(Math.random() * 100);
        System.out.println(num);
        
        double result8 = Math.random();
        System.out.println(result8);
        
    }
}

// maximun
public class Math_java {

    public static void main(String[] args) {

        int marks1 = 85;
        int marks2 = 90;

        int highest = Math.max(marks1, marks2);

        System.out.println("Highest marks: " + highest);

    }

}

// minimum 
public class Math_java {

    public static void main(String[] args) {

        int temp1 = 32;
        int temp2 = 25;

        int lowest = Math.min(temp1, temp2);

        System.out.println("Lowest temperature is: " + lowest);

    }

}

// square root 
public class Math_java {

    public static void main(String[] args) {

        int number = 64;

        double result = Math.sqrt(number);

        System.out.println("Square root is: " + result);

    }

}
