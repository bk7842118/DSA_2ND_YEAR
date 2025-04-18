import java.util.*;

public class reverse_a_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(8);
        stack.push(6);
        Stack<Integer> stack2 = new Stack<>();
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }
        System.out.println(stack2);
  
    }
}
