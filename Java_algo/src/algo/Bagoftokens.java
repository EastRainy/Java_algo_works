package algo;

import java.util.Arrays;

public class Bagoftokens {

    public int bagOfTokensScore(int[] tokens, int power) {
        
        
        int score = 0, maxscore=0;
        int fronti = 0, backi = tokens.length-1;//two pointer 사용
        
    
        Arrays.sort(tokens); //토큰 순서는 상관 없으니 오름차순 정렬
        
        while(fronti<=backi){

            if(power>=tokens[fronti]){ //power가 가장 작은 token보다 클때
                score++;
                power = power-tokens[fronti];
                fronti++;
                if(score>maxscore) maxscore=score;
                continue;
            }
            else{
                if(score<1){
                    break; // power를 늘릴 방법이 없다면 종료
                }
                else{ //score가 있으면 power를 늘림
                    score--;
                    power = power + tokens[backi];
                    backi--;
                }
            }

        }

        return maxscore;
        //우리가 원한건 모든 과정을 실행한 스코어가 아닌 max를 원하기 때문에 maxscore 리턴
}
