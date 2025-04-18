import java.util.*;

public class remove_all_adjacent_duplicates_leetcode {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek()== s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String ans = "";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}
