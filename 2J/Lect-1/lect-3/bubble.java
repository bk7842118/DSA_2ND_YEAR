import java.util.*;

public class bubble {
        public static void main(String[] args) {
            int[] arr = { 60, 35, 62, 64, 618, 73 };
            int n = arr.length;
            for (int t = 0; t < n-1; t++) {
                boolean swap=true;
                for (int i = 0; i < n - 1 - t; i++) {
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        swap=false;
                    }
                }
                if(swap==true)break;
            }
            System.out.println(Arrays.toString(arr));
        }
    } 
