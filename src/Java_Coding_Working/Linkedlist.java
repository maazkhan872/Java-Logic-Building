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
        students.add("Ayesha");

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
        numbers.add(70);
        numbers.add(80);

        
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

// Calculate Sum of All Elements
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}

// Find the Smallest Number
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(5);
        numbers.add(30);

        int min = numbers.get(0);

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Smallest Number: " + min);
    }
}

// Count Occurrences of a Number
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);
        numbers.add(40);

        int target = 10;
        int count = 0;

        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }

        System.out.println(target + " appears " + count + " times.");
    }
}

// Find the Middle Element
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
        numbers.add(70);

        int middleIndex = numbers.size() / 2;

        System.out.println("Middle Element is: " + numbers.get(middleIndex));
    }
}

// Check if a LinkedList is Empty
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Ali");
        names.add("Ahmed");

        if (names.isEmpty()) {
            System.out.println("LinkedList is empty");
        } else {
            System.out.println("LinkedList contains data");
        }
    }
}

// Find the First and Last Element
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Karachi");
        cities.add("Lahore");
        cities.add("Islamabad");
        cities.add("Peshawar");

        System.out.println("First Element: " + cities.getFirst());
        System.out.println("Last Element: " + cities.getLast());
    }
}

import java.util.LinkedList;

public class Linkedlist {

    public static int findMax(LinkedList<Integer> list) {

        int max = list.getFirst();

        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(50);
        list.add(20);
        list.add(80);
        list.add(30);

        System.out.println("Maximum Element: " + findMax(list));
    }
}


import java.util.LinkedList;

public class Linkedlist {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Print LinkedList
        System.out.println("Original List: " + list);

        // Search element
        if (list.contains(30)) {
            System.out.println("30 found in the list");
        } else {
            System.out.println("30 not found");
        }

        // Remove element
        list.remove(Integer.valueOf(20));

        // Print updated list
        System.out.println("Updated List: " + list);
    }
}

// Replace an Element
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Ali");
        names.add("Ahmed");
        names.add("Usman");

        int index = names.indexOf("Ali");

        if(index != -1) {
            names.set(index, "Maaz");
        }

        System.out.println(names);
    }
}

// Count Total String Lengths
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Ali");
        names.add("Ahmed");
        names.add("Usman");

        int totalLength = 0;

        for(String name : names) {
            totalLength += name.length();
        }

        System.out.println("Total Characters: " + totalLength);
    }
}

// Find the Longest Name
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Ali");
        names.add("Muhammad");
        names.add("Usman");
        names.add("Ahmed");

        String longest = names.getFirst();

        for(String name : names) {

            if(name.length() > longest.length()) {
                longest = name;
            }
        }

        System.out.println("Longest Name: " + longest);
    }
}

// Containing Only Even Numbers
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        LinkedList<Integer> evenNumbers = new LinkedList<>();

        for(int num : numbers) {

            if(num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        System.out.println("Original List: " + numbers);
        System.out.println("Even List: " + evenNumbers);
    }
}

// Merge Two LinkedLists
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Java");
        list1.add("Python");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("C++");
        list2.add("JavaScript");

        list1.addAll(list2);

        System.out.println("Merged List: " + list1);
    }
}

// Remove All Negative Numbers
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(-5);
        numbers.add(20);
        numbers.add(-15);
        numbers.add(30);

        numbers.removeIf(num -> num < 0);

        System.out.println("Updated List: " + numbers);
    }
}

// Element at a Specific Index
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("C++");
        languages.add("JavaScript");
        languages.add("Go");

        // Insert at index 2
        languages.add(2, "Python");

        System.out.println("Updated LinkedList:");
        System.out.println(languages);
    }
}

// Print Elements at Odd Indexes
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

        System.out.println("Elements at Odd Indexes:");

        for (int i = 1; i < numbers.size(); i += 2) {
            System.out.println(numbers.get(i));
        }
    }
}

// Find the Index of an Element
import java.util.LinkedList;

public class Linkedlist {

    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        int index = fruits.indexOf("Mango");

        if (index != -1) {
            System.out.println("Mango found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}

//Copy One LinkedList into Another
import java.util.LinkedList;

public class Linkedlist {

 public static void main(String[] args) {

     LinkedList<String> courses = new LinkedList<>();

     courses.add("Java");
     courses.add("Spring Boot");
     courses.add("SQL");

     LinkedList<String> copiedList = new LinkedList<>();

     copiedList.addAll(courses);

     System.out.println("Original List: " + courses);
     System.out.println("Copied List: " + copiedList);
 }
}

// Swap First and Last Elements
import java.util.LinkedList;

public class Linkedlist {

    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Karachi");
        cities.add("Lahore");
        cities.add("Islamabad");
        cities.add("Peshawar");

        String first = cities.getFirst();
        String last = cities.getLast();

        cities.set(0, last);
        cities.set(cities.size() - 1, first);

        System.out.println("Updated List:");
        System.out.println(cities);
    }
}