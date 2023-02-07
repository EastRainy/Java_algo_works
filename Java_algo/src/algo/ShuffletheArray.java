package algo;

public class ShuffletheArray {

    public int[] shuffle(int[] nums, int n) {
        
        // 2n 길이의 배열을 [x1, x2, x3 ... y1, y2, y3... ] 에서 [x1, y1, x2, y2, x3, y3 ...]으로 재배열
        
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i = i+2){

            ans[i] = nums[i/2];
            ans[i+1] = nums[n+i/2];

        }


        return ans;

    }
    
}
