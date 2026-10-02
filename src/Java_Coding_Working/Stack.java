import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Add elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
         stack.push(60);

        // Print top element
        System.out.println(stack.peek());
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);


        System.out.println("Before Pop: " + stack);

        int removed = stack.pop();

        System.out.println("Removed: " + removed);
        System.out.println("After Pop: " + stack);
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println("Is Stack Empty? " + stack.isEmpty());

        stack.push(10);
        stack.push(20);

        System.out.println("Is Stack Empty? " + stack.isEmpty());
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Add elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Peek
        System.out.println("Top: " + stack.peek());

        // Pop
        System.out.println("Removed: " + stack.pop());

        // Peek again
        System.out.println("Top: " + stack.peek());

        // Pop again
        System.out.println("Removed: " + stack.pop());

        // Final Stack
        System.out.println("Stack: " + stack);
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack: " + stack);

        System.out.println("Size: " + stack.size());
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack elements:");

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Popping elements:");

        while (!stack.isEmpty()) {

            System.out.println(stack.pop());
        }

        System.out.println("Stack is empty: " + stack.isEmpty());
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int search = 30;

        if (stack.contains(search)) {
            System.out.println(search + " is present in Stack");
        } else {
            System.out.println(search + " is not present in Stack");
        }
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();

        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);

        Stack<Integer> stack2 = new Stack<>();

        // Copy elements
        for (int i = 0; i < stack1.size(); i++) {
            stack2.push(stack1.get(i));
        }

        System.out.println("Original Stack: " + stack1);
        System.out.println("Copied Stack: " + stack2);
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < stack.size(); i++) {

            int value = stack.get(i);

            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Stack: " + stack);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Add elements
        stack.push(15);
        stack.push(40);
        stack.push(10);
        stack.push(50);
        stack.push(20);

        int max = stack.get(0);
        int min = stack.get(0);

        // Find maximum and minimum
        for (int i = 1; i < stack.size(); i++) {

            int value = stack.get(i);

            if (value > max) {
                max = value;
            }

            if (value < min) {
                min = value;
            }
        }

        System.out.println("Stack: " + stack);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}


import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();

        // Add elements
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);

        Stack<Integer> stack2 = new Stack<>();

        // Reverse using pop and push
        while (!stack1.isEmpty()) {

            int value = stack1.pop();

            stack2.push(value);
        }

        System.out.println("Original Stack: " + stack1);
        System.out.println("Reversed Stack: " + stack2);
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Add elements
        stack.push(10);
        stack.push(-5);
        stack.push(20);
        stack.push(-15);
        stack.push(0);
        stack.push(30);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        // Count numbers
        for (int i = 0; i < stack.size(); i++) {

            int value = stack.get(i);

            if (value > 0) {
                positive++;
            } 
            else if (value < 0) {
                negative++;
            } 
            else {
                zero++;
            }
        }

        System.out.println("Stack: " + stack);
        System.out.println("Positive Numbers: " + positive);
        System.out.println("Negative Numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Add elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int sum = 0;

        // Calculate sum
        for (int i = 0; i < stack.size(); i++) {

            sum = sum + stack.get(i);
        }

        // Calculate average
        double average = (double) sum / stack.size();

        System.out.println("Stack: " + stack);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Add elements
        stack.push(10);
        stack.push(50);
        stack.push(30);
        stack.push(20);
        stack.push(40);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find largest and second largest
        for (int i = 0; i < stack.size(); i++) {

            int value = stack.get(i);

            if (value > largest) {

                secondLargest = largest;
                largest = value;

            } else if (value > secondLargest && value < largest) {

                secondLargest = value;
            }
        }

        System.out.println("Stack: " + stack);
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Add elements
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        stack.push(35);

        System.out.println("Original Stack: " + stack);

        Stack<Integer> temp = new Stack<>();

        // Remove even numbers
        while (!stack.isEmpty()) {

            int value = stack.pop();

            if (value % 2 != 0) {
                temp.push(value);
            }
        }

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        System.out.println("Updated Stack: " + stack);
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Add elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Find bottom and top elements
        int bottom = stack.firstElement();
        int top = stack.peek();

        System.out.println("Stack: " + stack);
        System.out.println("Bottom Element: " + bottom);
        System.out.println("Top Element: " + top);
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // First Stack
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);

        // Second Stack
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);

        // Compare Stacks
        if (stack1.equals(stack2)) {
            System.out.println("Both Stacks are Equal");
        } else {
            System.out.println("Stacks are Not Equal");
        }
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int search = 30;

        int positionBottom = stack.indexOf(search) + 1;

        if (positionBottom > 0) {

            int positionTop = stack.size() - positionBottom + 1;

            System.out.println("Element: " + search);
            System.out.println("Position from Bottom: " + positionBottom);
            System.out.println("Position from Top: " + positionTop);

        } else {
            System.out.println("Element not found");
        }
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int remove = 30;

        System.out.println("Original Stack: " + stack);

        if (stack.contains(remove)) {
            stack.remove(Integer.valueOf(remove));
            System.out.println("Updated Stack: " + stack);
        } else {
            System.out.println("Element not found");
        }
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(10);
        stack.push(30);
        stack.push(10);
        stack.push(40);

        int search = 10;
        int count = 0;

        for (int i = 0; i < stack.size(); i++) {

            if (stack.get(i) == search) {
                count++;
            }
        }

        System.out.println("Stack: " + stack);
        System.out.println(search + " occurs " + count + " times");
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(45);

        int top = stack.peek();

        System.out.println("Stack: " + stack);
        System.out.println("Top Element: " + top);

        if (top % 2 == 0) {
            System.out.println(top + " is Even");
        } else {
            System.out.println(top + " is Odd");
        }
    }
}

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);

        System.out.println("Stack 1 Before: " + stack1);
        System.out.println("Stack 2 Before: " + stack2);

        while (!stack1.isEmpty()) {

            int value = stack1.pop();

            stack2.push(value);
        }

        System.out.println("Stack 1 After: " + stack1);
        System.out.println("Stack 2 After: " + stack2);
    }
}


import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(35);
        stack.push(20);
        stack.push(40);
        stack.push(15);
        stack.push(50);

        int number = 25;

        System.out.println("Elements greater than " + number + ":");

        for (int i = 0; i < stack.size(); i++) {

            int value = stack.get(i);

            if (value > number) {
                System.out.println(value);
            }
        }

        System.out.println("Original Stack: " + stack);
    }
}
