import java.util.*;

public class coin_toss {
    public static void main(String[] args) {
		String ans="";
		cointoss(3,ans);

	}
	public static void cointoss(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return ;
		}
	      cointoss(n-1,ans+"H");
		  cointoss(n-1,ans+"T");
	
	}   
}
