import java.util.*;

public class stock_span {
    public static void main(String args[])  {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			arr[i]=x;
		}
		int ans[]=new int[n];
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<n;i++){
			while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
			}
			if(st.isEmpty()){
				ans[i]=i+1;
			}else{
				ans[i]=i-st.peek();
			}
			st.push(i);
		}
		for(int i=0;i<n;i++){
			System.out.print(ans[i]+" ");
		}
		System.out.print("END");
	

	}
}
