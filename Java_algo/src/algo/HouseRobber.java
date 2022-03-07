package algo;

class HouseRobber{

    /*

        문제 : 어떤 도둑이 n개의 집의 돈을 훔치려고 한다.
        이때, 붙어있는 두 집을 연달아 훔치려고 한다면 신고되어 경찰이 출동한다고 한다.
        경찰에 신고되지 않고 도둑이 훔칠 수 있는 최대 돈의 수는?

    */

    public static void HouseRobber(){

        int[] input = {1,2,3,1};

        System.out.println(rob(input));

    }
    public static int rob(int[] nums) {
        
        //When robbing i houes, In this condition, you can get max money
        //1. money that robbing until max money house[i-2] + house[i] (robbing last house is best case)
        //2. money that robbing until max money house[i-1](robbing last house is not best case)
        
        //==>한글로 쓰자면, 들키지 않고 얻는 돈의 최대치는 마지막 집을 털때와 안털때로 구분
        //이를 위해 동적 프로그래밍으로 메모이제이션 이용해여 구현

        int[] memo = new int[nums.length];
        
        if(nums.length == 0){
            return 0;
        }
        else if(nums.length==1){
            return nums[0];
        }

        memo[0] = nums[0];
        memo[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i<nums.length; i++){
            memo[i] = Math.max(memo[i-2]+nums[i], memo[i-1]);
        }


        return memo[memo.length-1];

    }

}