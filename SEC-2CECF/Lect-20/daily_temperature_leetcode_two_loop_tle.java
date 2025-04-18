import java.util.*;

public class daily_temperature_leetcode_two_loop_tle {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[i]<temperatures[j]){
                    ans[i]=j-i;
                    break;
                }
            }

        }
        return ans;
        
    }
}
