import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Add elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

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
