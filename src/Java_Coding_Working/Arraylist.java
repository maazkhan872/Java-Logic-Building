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

// Find Second Largest Number
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(42);
        numbers.add(8);
        numbers.add(23);
        numbers.add(42);
        numbers.add(48);
        numbers.add(87c);

        // Remove duplicates
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int num : numbers) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        // Sort list
        Collections.sort(uniqueList);

        if (uniqueList.size() >= 2) {
            int secondLargest = uniqueList.get(uniqueList.size() - 2);
            System.out.println("Second Largest: " + secondLargest);
        } else {
            System.out.println("Not enough elements");
        }
    }
}

package Java_Coding_Working;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Arraylist{
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> students = new ArrayList<>();

        students.add("Ali");
        students.add("Ahmed");
        students.add("Sara");
        students.add("Ali");     // duplicate
        students.add("Hina");
        students.add("Ayesha");
        students.add("Maaz");
        students.add("Fatima");
        students.add("Ashar");

        System.out.println("Original List of Students is: " + students);

        // Remove duplicates using HashSet
        HashSet<String> set = new HashSet<>(students);
        students = new ArrayList<>(set);

        // Sort the list
        Collections.sort(students);

        System.out.println("Sorted Unique List: " + students);

        // Print names starting with 'A'
        System.out.println("Names starting with A:");
        for (String name : students) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
    }
}