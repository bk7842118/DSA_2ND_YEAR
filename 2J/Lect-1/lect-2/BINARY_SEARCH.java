
import java.util.*;
public class BINARY_SEARCH {
    public static void main(String[] args) {
        int arr[]={5,10,15,100,180,200};
        int target=1000;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                System.out.println("target found");
                return;
            }
        }
        System.out.println("target not found");
    }
}
