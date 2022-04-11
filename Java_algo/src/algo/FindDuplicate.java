package algo;

import java.util.HashSet;

public class FindDuplicate {

    
    public int findDuplicate(int[] nums){
        
        int ans= 0;

        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i=0; i<nums.length; i++){
            
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
            else{
                ans = nums[i];
            }

        }

        return ans;


    }


}
