import java.util.*;

public class partition_of_an_array {
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
	public static void main(String[] args) {
	    int []arr={25,17,9,12,10,11};
		System.out.println(partition(arr,0,arr.length-1));
}
}
