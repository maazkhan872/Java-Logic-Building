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
        numbers.add(50);
        numbers.add(60);

        
        System.out.println("Original List is:");
        System.out.println(numbers);

        // Reverse list
        Collections.reverse(numbers);

        System.out.println("Reversed List is:");
        System.out.println(numbers);
    }
}

// Find Maximum Number in LinkedList
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(15);
        numbers.add(90);
        numbers.add(45);
        numbers.add(120);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);

        int max = numbers.get(0);

        for(int num : numbers) {

            if(num > max) {
                max = num;
            }
        }

        System.out.println("Maximum Number: " + max);
    }
}

// Remove Duplicate Elements
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        LinkedList<Integer> uniqueList = new LinkedList<>();

        for(int num : numbers) {

            if(!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        System.out.println("Original List:");
        System.out.println(numbers);

        System.out.println("Unique List:");
        System.out.println(uniqueList);
    }
}

// Search an Element
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        numbers.add(35);

        int searchNumber = 25;

        if(numbers.contains(searchNumber)) {

            System.out.println(searchNumber + " Found in LinkedList");

        } else {

            System.out.println(searchNumber + " Not Found");
        }
    }
}

// Count Even Numbers
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);

        int count = 0;

        for (int num : numbers) {

            if (num % 2 == 0) {
                count++;
            }
        }

        System.out.println("Total Even Numbers: " + count);
    }
}