import java.util.*;

public class find_first_last_pos {
    public static int[] searchRange(int[] arr, int target) {
        int []ans={-1,-1};
       for(int i=0;i<arr.length;i++){
                   if(arr[i]==target){
                       ans[0]=i;
                       break;
                   }
       } 
          for(int i=arr.length-1;i>=0;i--){
                   if(arr[i]==target){
                       ans[1]=i;
                       break;
                   }
       } 
       return ans;
    }
    public static int[] searchRange1(int[] nums, int target) {
        int ans[]={-1,-1};
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                if(mid==l || nums[mid]!=nums[mid-1]){
                    ans[0]=mid;
                    break;
             }else{
                     r=mid-1; 
                }
            }
        }
         l=0;
          r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                if(mid==r || nums[mid]!=nums[mid+1]){
                   ans[1]=mid;
                    break;
                }else{
                      l=mid+1;
                   
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={5,7,8,8,8,8,8,8,12};
        int target=8;
        int ans[]=searchRange(nums,target);
        int ans1[]=searchRange1(nums,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans1));
    }
}
