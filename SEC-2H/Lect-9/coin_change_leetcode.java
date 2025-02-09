import java.util.*;

public class coin_change_leetcode {
    public int coinChange(int[] coins, int amount) {
        ArrayList<Integer> list = new ArrayList<>();
        ans = Integer.MAX_VALUE;
        coin_change(coins,amount,0,list,0);
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
    static int ans =Integer.MAX_VALUE;
    static void coin_change(int coins[],int amount,int current,ArrayList<Integer> list,int start){
        if(amount==current){
            ans = Math.min(list.size(),ans);
            return;
        }
        if(current>amount){
            return;
        }
        for(int i=start;i<coins.length;i++){
            list.add(coins[i]);
            coin_change(coins, amount, current+coins[i], list,i);
            list.remove(list.size()-1);
        }
    }
}
