import java.util.*;
public class SECOND_LARGEST_ELEMENT_2D_ARRAY {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of m & n");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]>fmax) {
					smax=fmax;
					fmax=arr[i][j];
				}else if(arr[i][j]>smax) {
					smax=arr[i][j];
				}
			}
		}
		System.out.println(smax);
		
	}

}
