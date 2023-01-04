package algo;

import java.util.Hashtable;
import java.util.Enumeration;

public class MinimumRoundstoComplete {
    public int minimumRounds(int[] tasks) {

        int ans = 0, el;

        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();

        for(int i=0; i<tasks.length; i++){
            if(!ht.containsKey(tasks[i])){
                ht.put(tasks[i],1);
            }
            else{
                ht.put(tasks[i], ht.get(tasks[i])+1);
            }
        }

        Enumeration<Integer> vals = ht.elements();

        while(vals.hasMoreElements()){
            el = vals.nextElement().intValue();
            if(el == 1) return -1;
            
            ans += (el+2)/3;
        }
        return ans;
    }
}
