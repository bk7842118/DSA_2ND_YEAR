import java.util.*;;

public class merge_sort {
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
    public static int[] merge_sort(int arr[],int si,int ei){
        if(si==ei){
           int a[]=new int[1];
           a[0]=arr[si];
           return a;
        }
        int mid=(si+ei)/2;
        int x[]=merge_sort(arr,si,mid);
        int y[]=merge_sort(arr,mid+1,ei);
        return merge(x,y);
    }
    public static void main(String[] args) {
        int arr[]={25,7,11,19,9,20};
        int ans[]=merge_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(ans));
    }
}
