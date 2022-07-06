package algo;

public class FibonacciNumber {

    public int fib(int n) {
        
        //전형적인 Dynamic programing 문제
        //전에 구했던 값을 메모리에 기억해놓으면 다시 계산해 올 필요가 없다

        int mem1=1, mem2=0;
        int ans = 0;
        
        if(n==1||n==0){
            return n;
        }
        for(int i=0; i<n-1; i++){
            ans = mem1 + mem2;
            mem2 = mem1;
            mem1 = ans;
        }
        return ans;
    }
    
}
