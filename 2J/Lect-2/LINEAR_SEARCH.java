
import java.util.*;
public class LINEAR_SEARCH {
    public static void main(String[] args) {
        int arr[]={10,20,5,8,50};
        int target=5;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("target found");
                return;
            }
        }
        System.out.println("target not found");

    }
}
