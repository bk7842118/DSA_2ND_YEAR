import java.util.*;

public class coin_change_combination {
    public static void main(String[] args) {
        int coins[] = {2,3,5};
        ArrayList<Integer> list = new ArrayList<>();
        coinschange(coins, 8, 0, list,0);
    }
    static void coinschange(int coins[],int target,int current,ArrayList<Integer> list,int start){
        if(current==target){
            System.out.println(list);
            return;
        }
        if(current>target){
            return;
        }
        for(int i=start;i<coins.length;i++){
            list.add(coins[i]);
            coinschange(coins, target, current+coins[i], list,i);
            list.remove(list.size()-1);//backtrack
        }
    }
}
