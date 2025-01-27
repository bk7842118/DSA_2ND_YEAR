import java.util.*;

public class factorial {
    public static int fact(int n){
        // base case
        if(n==0){
            return 1;
        }
        // recursive call
        int x=fact(n-1);
        // small calculation
        return n*x;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
