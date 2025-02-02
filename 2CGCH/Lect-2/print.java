import java.util.*;

public class print {
    public static void print(int n){
        // base case
      if(n==0)return;
    //   recursive call
      print(n-1);
    //   small cal
      System.out.println(n);
    }
    public static void main(String[] args) {
        print(5);
    }
}
