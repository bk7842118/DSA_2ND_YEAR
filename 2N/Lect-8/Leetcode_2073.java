import java.util.*;

public class Leetcode_2073 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int timer=0;
        Queue<Integer> Q = new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            Q.offer(i);
        }
        while(!Q.isEmpty()){
            int X = Q.poll();
            tickets[X]--;
            timer++;
            if(X==k && tickets[X]==0){
                break;
            }
            if(tickets[X]!=0){
                Q.add(X);
            }
        }
        return timer;
    }

}
