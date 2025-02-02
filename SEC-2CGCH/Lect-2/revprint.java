import java.util.*;

public class revprint {
    public static void revprint(int n){
        // base case
        if(n==0)return;
        // small cal
        System.out.println(n);
        // recursive call
        revprint(n-1);
    }
 public static void main(String[] args) {
    revprint(5);
 }   
}
