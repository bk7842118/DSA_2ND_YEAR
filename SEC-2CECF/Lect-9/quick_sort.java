import java.util.*;

public class quick_sort {
    public static int partition(int[] arr, int si, int ei) {
		int element = arr[ei];
		int pos = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] < element) {
				int temp = arr[i];
				arr[i] = arr[pos];
				arr[pos] = temp;
				pos++;
			}
		}
		int temp= arr[ei];
		arr[ei] = arr[pos];
		arr[pos] = temp;
		return pos;
	}
    public static void quick_sort(int arr[],int si,int ei){
        if(si>=ei)return;
        int pivot=partition(arr, si, ei);
        quick_sort(arr, si, pivot-1);
        quick_sort(arr, pivot+1, ei);
    }
   public static void main(String[] args) {
    int arr[]={25,7,11,19,9,20};
    quick_sort(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
   } 
}
