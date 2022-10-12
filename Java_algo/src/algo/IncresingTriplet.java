package algo;

public class IncresingTriplet {
    
    public boolean increasingTriplet(int[] nums) {
        
        //문제 : n[a] < n[b] < n[c] 인 인덱스 a<b<c 가 존재하는가?
        // subtarget : 이를 Time O(n), Space O(1) complexity 로 해결할 수 있는가?
        
        int mid = Integer.MAX_VALUE, min = Integer.MAX_VALUE;


        for(int n:nums){
            if(n<=min){
                min = n;//제일 작은 값이 나오면 min 갱신
            }
            else if(n<=mid){
                mid = n;//min보다 크지만 그중 가장 작은 값이 나오면 계속 갱신
            }
            else{
                return true;//min과 mid보다 큰 값이 찾아지면 min<mid<n 성립하므로 true 리턴
            }
        }
        return false;//성립안하면 안찾아진것
    }

}
