
import java.util.*;
public class insertion_sort {
    public static void main(String[] args) {

		int[] arr = { 60, 30, 50, 20, 70, 10 };

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		System.out.println(Arrays.toString(arr));

	}
}
