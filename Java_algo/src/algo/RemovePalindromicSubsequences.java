package algo;

public class RemovePalindromicSubsequences {
    
    /*
        문자열은 a와 b로 구성되어 있음
        앞뒤가 똑같은 문장을 제거할 수 있음. 이때 문장은 순서는 바뀌면 안되지만 꼭 연속적 문장일 필요는 없음
        그렇다면, 주어진 문자열을 비울때 필요한 제거 횟수?

    */
    public int removePalindromeSub(String s) {
        
      
        int i = 0, j = s.length()-1;

        if(j==-1){
            return 0;//빈문장인경우
        }
        
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return 2;// 최악의 경우 a aaa a a... 제거 후 b bbbb b bb b..제거(연속적일 필요는 없으므로)
            }
        }
        return 1;//문장전체가 앞뒤 같을경우
    
    }
}



