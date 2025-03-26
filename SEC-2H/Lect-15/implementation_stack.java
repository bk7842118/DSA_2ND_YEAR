import java.util.*;
class stack {
    int[] arr;
 	int idx;
 
        stack() {
 		arr = new int[5];
 		idx = -1;
     	}
 
       stack(int n) {
 		arr = new int[n];
 		idx = -1;
     	}
 
 	public boolean isEmpty() {
 		return idx == -1;
 	}
 	public void push(int x) {
 		if (idx==arr.length-1) {
 		    System.out.println("stack is full");
 		    return;
 		}
 		arr[idx+1] = x;
 		idx++;
 	}
 
 	public int size() {
 		return idx + 1;
 	}
 
 	public int pop()  {
 		if(isEmpty()) {
 		     System.out.println("stack is empty");
 		     return -1;
 		}
 		int x = arr[idx];
 		idx--;
 		return x;
 
 	}
 
 	public int peek() {
 		if(isEmpty()) {
 			 System.out.println("stack is empty");
 		     return -1;
 		}
 		int x = arr[idx];
 		return x;
 
 	}
 
 	public void print() {
 		for (int i = 0; i <= idx; i++) {
 			System.out.print(arr[i] + " ");
 		}
 		System.out.println("END");
 
 	}
 }
public class implementation_stack {
    public static void main(String[] args) {
        stack st = new stack();
 		st.push(5);
 		st.push(4);
 		st.push(11);
 		st.push(12);
 		st.print();
 		System.out.println(st.peek());
 		System.out.println(st.pop());
         System.out.println(st.size());
 		st.print();
    }
}
