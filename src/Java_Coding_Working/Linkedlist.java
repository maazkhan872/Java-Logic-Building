package Java_Coding_Working;


// Student Names Manager Task
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        // Adding students
        students.add("Ali");
        students.add("Ahmed");
        students.add("Maaz");
        students.add("Usman");
        students.add("Hamza");
        students.add("Hanza");
        students.add("Hunzala");

        // Remove one student
        students.remove("Ahmed");

        // Print students
        System.out.println("Student List:");

        for(String name : students) {
            System.out.println(name);
        }
    }
}

// Task Queue System
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        // Normal tasks
        tasks.add("Complete API");
        tasks.add("Fix Bug");
        tasks.add("Push Code");
        tasks.add("Connectivity with JDBC");

        // Urgent task
        tasks.addFirst("Production Issue");

        // Remove completed task
        tasks.remove("Fix Bug");

        // Print tasks
        System.out.println("Remaining Tasks:");

        for(String task : tasks) {
            System.out.println(task);
        }
    }
}

// Reverse a LinkedList
import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original List:");
        System.out.println(numbers);

        // Reverse list
        Collections.reverse(numbers);

        System.out.println("Reversed List:");
        System.out.println(numbers);
    }
}
