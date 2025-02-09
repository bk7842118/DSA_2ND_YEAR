import java.util.*;

public class coin_change_permutation {
    public static void main(String[] args) {
        int coins[] = {2,3,5};
        ArrayList<Integer> list = new ArrayList<>();
        coin_change(coins, 8, 0, list);
    }
    static void coin_change(int coins[],int target,int current,ArrayList<Integer> list){
        if(current==target){
            System.out.println(list);
            return;
        }
        if(current>target){
            return;
        }
        for(int i=0;i<coins.length;i++){
            list.add(coins[i]);
            coin_change(coins, target, current+coins[i], list);
            list.remove(list.size()-1);
        }
    }
}
