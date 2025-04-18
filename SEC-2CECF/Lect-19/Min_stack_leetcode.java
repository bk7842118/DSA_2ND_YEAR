import java.util.*;

public class Min_stack_leetcode {
    Stack<Integer> s;
    Stack<Integer> minStack;

    public MinStack() {
        s = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        s.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        int x = s.pop();
        if(minStack.peek() == x) {
            minStack.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    } 
}
