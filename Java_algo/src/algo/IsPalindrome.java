package algo;
import java.util.Stack;

public class IsPalindrome {
    
    //앞뒤 대칭인 수인지 확인하는 문제
    //String으로 풀면 간단하지만 변환하지 않고 문제를 해결해보는 제약

    public boolean isPalindrome(int x) {
        
        Stack<Integer> s = new Stack<Integer>();

        int tmp = x;
        int cnt;

        if(x<0){
            return false;
        }

        while(tmp!=0){
            s.push(tmp%10);
            tmp = tmp/10;
        }
        cnt = s.size()/2;
        while(x!=0){
            if(x%10!=s.peek()){
                return false;
            }
            else{
                s.pop();
                x = x/10;
                if(s.size()==cnt){
                    break;
                }
            }
        }
        return true;
    }

    //절반까지 비교했을때 끝내도록 if문을 짜면 오히려 사용 메모리 및 오버헤드가 더 커졌다
    //==> 이를 if문 없이 제한하는 방법 고민 필요


}
