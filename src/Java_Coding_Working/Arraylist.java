package Java_Coding_Working;

import java.util.ArrayList;

import java.util.ArrayList;

// Get Element by Index
public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ayesha Khan");
        names.add("Aliza Ahmed");
        names.add("Orhan");

        System.out.println(names.get(1));
    }
}

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
        students.add("Adil");

        System.out.println("Original List of Students is: " + students_name);

        // Remove duplicates using HashSet
        HashSet<String> set = new HashSet<>(students_name);
        students = new ArrayList<>(set);

        // Sort the list
        Collections.sort(students_name);

        System.out.println("Sorted Unique List: " + students_name);

        // Print names starting with 'A'
        System.out.println("Names starting with A:");
        for (String name : students) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
    }
}


// Find Maximum Element
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(15);
        list.add(25);
        list.add(10);
        list.add(5);
        list.add(28);

        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println("Max value is: " + max);
    }
}

// First Non-Repeating Element
import java.util.*;

public class Arraylist {
    public static int findFirstNonRepeating(ArrayList<Integer> list) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency
        for (int num : list) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Find first with frequency 1
        for (int num : list) {
            if (freq.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 1, 2, 0, 4, 1, 2));
        System.out.println(findFirstNonRepeating(list));
    }
}

// Find Maximum Element
import java.util.*;

public class Arraylist {
    public static int findMax(ArrayList<Integer> list) {
        int max = list.get(0); 

        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 5, 20, 8));
        System.out.println(findMax(list));
    }
}