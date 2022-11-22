package algo;

public class PerfectSquares {

    // Find at least number of perfect square numbers that sum to n

    //재귀 => 시간 초과, DP로 문제 해결 시도
    //Space O(n), Time = O(sqrt(n)) - 제곱했을 때 n보다 작은 정수 숫자만큼
    
    public int numSquares(int n) {


        int[] dp = new int[n+1];
        for(int i=0; i<=n; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0; //<-꼭 해줘야함 중요

        int crrX = 1;
        int sq = crrX * crrX;

        while(sq<=n){
         
            sq = crrX * crrX;

            for(int i = sq; i<=n; i++){
                dp[i] = Math.min(dp[i], dp[i-sq]+1);
            }

            crrX++;
        }
        
        return dp[n];
    }

}
