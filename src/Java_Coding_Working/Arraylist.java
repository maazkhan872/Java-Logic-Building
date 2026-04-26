package Java_Coding_Working;

//Store and Print List of Names
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        // Adding elements
        students.add("Ali");
        students.add("Ahmed");
        students.add("Sara");
        students.add("Hina");
        students.add("Usman");

        // Printing elements
        for (String name : students) {
            System.out.println(name);
        }
    }
}

// Find Even Numbers
import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(10, 15, 20, 25, 30, 33)
        );

        System.out.println("Even Numbers:");

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}