package Java_Coding_Working;

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


import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        // ArrayList create
        ArrayList<String> names = new ArrayList<>();

        // Data add karna
        names.add("Ali");
        names.add("Ahmed");
        names.add("Sara");
        names.add("Maaz");

        System.out.println(names);

        // Specific element access
        System.out.println("First element: " + names.get(0));
        System.out.println("First element: " + names.get(1));

        // Update element
        names.set(1, "Usman");

        // Remove element
        names.remove("Sara");

        // Loop through ArrayList
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Size: " + names.size());
    }
}


import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        // ArrayList create
        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Ali");
        names.add("Ahmed");
        names.add("Sara");

        // Print list
        System.out.println("List: " + names);

        // Get element
        System.out.println("First: " + names.get(0));

        // Update element
        names.set(1, "Usman");

        // Remove element
        names.remove("Sara");

        // Final list
        System.out.println("Updated List: " + names);
    }
}

// Find Duplicate Elements
import java.util.ArrayList;
import java.util.HashSet;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : numbers) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}