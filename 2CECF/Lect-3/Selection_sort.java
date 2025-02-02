import java.util.*;
public class Selection_sort {
   public static void main(String[] args) {
    int[] arr = { 50, 130, 70, 5,10, 20 };

		for (int i = 0; i < arr.length; i++) {
			int min_idx= i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
		System.out.println(Arrays.toString(arr));
   } 
}
