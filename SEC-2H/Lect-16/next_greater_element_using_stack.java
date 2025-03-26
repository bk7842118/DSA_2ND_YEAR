import java.util.*;

public class next_greater_element_using_stack {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 1};
        int n=arr.length;
        ArrayList<Integer>ans=new  ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(-1);
        }
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
           while(!st.isEmpty() && st.peek()<=arr[i]){
               st.pop();
           }
           if(!st.isEmpty())ans.set(i,st.peek());
           st.push(arr[i]);
        }
        System.out.println(ans);
    }
}
