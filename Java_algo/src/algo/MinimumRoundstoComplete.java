package algo;

import java.util.HashMap;

public class MinimumRoundstoComplete {
    public int minimumRounds(int[] tasks) {

        int ans = 0;

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int i:tasks){

            hm.put(i, hm.getOrDefault(i, 0)+1);

        }

        for(int x : hm.values()){
            if(x==1) return -1;
            ans += (x+2)/3;
        }

        return ans;
    }
}
/* HashTable -> hashmap으로 변경, Enumeration 제거 */