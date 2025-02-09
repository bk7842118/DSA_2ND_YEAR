import java.util.*;

public class merge_two_sorted_array {
    public static  int[] merge(int arr1[],int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int ans[] = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                ans[k] = arr1[i];
                k++;
                i++;
            }else{
                ans[k] = arr2[j];
                k++;
                j++;

            }
        }
        while(i<n){
            ans[k] = arr1[i];
            k++;
            i++;

        }
        while(j<m){
            ans[k] = arr2[j];
            k++;
            j++;
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr1[]  = {10,30,40};
        int arr2[] = {20,60,100,120};
        int ans[]= merge(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }
}
