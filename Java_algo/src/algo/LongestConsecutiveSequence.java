package algo;

import java.util.HashSet;


public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i : nums){
            hs.add(i);
        }
        int maxCount = 0, crrN=0, crrC=1;
        
        for(int n:hs){ 
            if(hs.contains(n-1)){
                continue;
            }
            crrN = n; crrC = 1;
            while(hs.contains(crrN+1)){
                crrC++;
                crrN++;
            }
            maxCount = Math.max(maxCount, crrC);
        }
        
        return maxCount;
    
    }
}
