package algo;

public class SumEvenAfterQueries {

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        //init
        int mem = 0;
        int[] ans = new int[queries.length];


        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){mem = mem + nums[i];}
        }

        for(int q=0; q<queries.length; q++){
            //before cal cueries, nums[i] is even, dec mem
            if(nums[queries[q][1]]%2==0){mem = mem - nums[queries[q][1]];}

            nums[queries[q][1]] = nums[queries[q][1]] + queries[q][0]; 

            //after cal, check nums[i] is even, then cal mem
            if(nums[queries[q][1]]%2==0){mem = mem + nums[queries[q][1]];}
            ans[q] = mem;

            //==>So I can cal sum of even only one O(N+M)time complexity in nums(N), queries(M)
        }
    
        return ans;
    }
    
}
