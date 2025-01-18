import java.util.*;
public class move_zeroes {
   public static void main(String[] args) {
        // first method(with extra space)
        int nums[]={0,1,0,3,12};
        // int arr[]=nums;
        // int j=0;
        // for(int i=0;i<arr.length;i++){
        //   if(arr[i]!=0){
        //       nums[j]=arr[i];
        //       j++;
        //   }
        // }
        // for(;j<arr.length;j++){
        //     nums[j]=0;
        // }
        // System.out.println(Arrays.toString(nums));
        // second method(without extra space)
        int j=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]!=0){
              int temp=nums[j];
              nums[j]=nums[i];
              nums[i]=temp;
              j++;
          }
        }
         System.out.println(Arrays.toString(nums));

   } 
}
