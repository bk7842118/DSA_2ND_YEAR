import java.util.*;

public class rotate_image {
    public static void rotate(int[][] mat) {
        int n=mat.length;
        // transpose
        for(int row=0;row<n;row++){
            for(int col=0;col<=row;col++){
                int temp=mat[row][col];
                mat[row][col]=mat[col][row];
                mat[col][row]=temp;
            }
        }
        // reverse
       for(int row=0;row<n;row++){
            for(int col=0;col<n/2;col++){
                int temp=mat[row][col];
                mat[row][col]=mat[row][n-col-1];
                mat[row][n-col-1]=temp;
            }
            }

    }
   public static void main(String[] args) {
    int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
    rotate(mat);
    for(int i=0;i<mat.length;i++)
    System.out.println(Arrays.toString(mat[i]));
   } 
}
