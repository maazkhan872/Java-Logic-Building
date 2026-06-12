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