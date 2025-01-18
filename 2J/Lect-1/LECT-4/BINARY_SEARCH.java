import java.util.*;

public class BINARY_SEARCH {
    public static int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
   public static void main(String[] args) {
       int nums[]={5,8,9,10,12};
       int target=100;
       System.out.println(search(nums,target));
   } 
}
