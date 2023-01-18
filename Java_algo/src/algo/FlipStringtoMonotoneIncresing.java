package algo;

public class FlipStringtoMonotoneIncresing {

    public int minFlipsMonoIncr(String s) {
        
        int leftwindow = 0, rightwindow = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0') rightwindow++;
        }
        int ans = rightwindow;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                leftwindow++;
            }
            else{
                rightwindow--;
            }
            ans = Math.min(ans, leftwindow + rightwindow);
        }
        return ans;
    }
}

//window방식으로 0, 1로 바꿔야될 부분을 구분하여 ans의 최소값 구하기
