import java.util.*;
public class climb_stairs {
    public static int climbStairs(int n) {
        if(n==1 ||n==0)return 1;
          int x=climbStairs(n-1);
          int y=climbStairs(n-2);
         return (x+y);
    }
    public static void main(String[] args)
     {
        int n=3;
        System.out.println(climbStairs(n));
    }
}
