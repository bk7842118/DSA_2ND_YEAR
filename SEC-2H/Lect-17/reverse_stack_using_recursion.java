import java.util.*;

public class reverse_stack_using_recursion {
    public static void reverse(Stack<Integer>stack){
        if(stack.isEmpty()){
            return;
        }
        int x=stack.peek();
        stack.pop();
        reverse(stack);
        stack.insertElementAt(x,0);//inbuilt 
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(8);
        stack.push(6);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
        
    } 
}
