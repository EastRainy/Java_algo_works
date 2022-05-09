package algo;

public class FindUnsortedSubarray {


    public int findUnsortedSubarray(int[] nums){

        Integer subStart = null, subEnd = null;

        int maxVal = Integer.MIN_VALUE;


        for(int i=0; i<nums.length; i++){

            if(nums[i]>=maxVal){
                maxVal = nums[i];
            }
            else{
                if(subStart==null){
                    subStart = i-1;
                    subEnd = i;
                }else{
                    subEnd=i;
                }
                while(subStart>0 && nums[subStart-1]>nums[subEnd]){
                    subStart--;
                }

            }


        }
        if(subStart==null){
            return 0;
        }
        else{
            return subEnd-subStart+1;
        }


    }
    
}
