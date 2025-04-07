import java.util.*;

public class insert_element_at_bottom_recusively {
        public static void insert_at_bottom(Stack<Integer>stack,int element){
            if(stack.isEmpty()){
                stack.push(element);
                return;
            }
            int x=stack.peek();
            stack.pop();
            insert_at_bottom(stack,element);
            stack.push(x);
        }
        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            stack.push(8);
            stack.push(6);
            int element=1000;
            System.out.println(stack);
            insert_at_bottom(stack,element);
            System.out.println(stack);
            
        } 
}
