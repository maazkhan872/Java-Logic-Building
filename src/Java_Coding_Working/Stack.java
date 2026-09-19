import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Add elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

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
