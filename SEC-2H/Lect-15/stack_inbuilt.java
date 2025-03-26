import java.util.*;

public class stack_inbuilt {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(5);
        st.push(4);
        st.push(11);
        st.push(12);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st);
    }
}
