import java.util.*;

public class next_greater_element_two_loop {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 1};
        int n=arr.length;
        ArrayList<Integer>ans=new  ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(-1);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                ans.set(i,arr[j]);
                break;
                }
            }
        }
        System.out.println(ans);
    }
}
