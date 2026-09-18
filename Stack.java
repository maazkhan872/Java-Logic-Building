
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
