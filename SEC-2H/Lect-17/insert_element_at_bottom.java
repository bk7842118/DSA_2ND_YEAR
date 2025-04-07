import java.util.*;

public class insert_element_at_bottom {
   public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(8);
    stack.push(6);
    int x=1000;
    Stack<Integer> stack2 = new Stack<>();
    while (!stack.isEmpty()) {
        stack2.push(stack.pop());
    }
    stack.push(x);
    while (!stack2.isEmpty()) {
        stack.push(stack2.pop());
    }
    System.out.println(stack);
   } 
}
