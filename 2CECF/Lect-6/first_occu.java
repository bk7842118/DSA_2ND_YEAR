import java.util.*;

public class first_occu {
    public static int first_occurence(int arr[],int target,int idx){
        if(idx==arr.length)return -1;
        if(arr[idx]==target)return idx;
        return first_occurence(arr, target, idx+1);
    }
    public static void main(String[] args) {
        int arr[]={2,7,18,9,19};
        int target=9;
        System.out.println(first_occurence(arr,target,0));
    }
}
