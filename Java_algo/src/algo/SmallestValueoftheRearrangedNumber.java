package algo;

import java.util.ArrayList;
import java.util.Comparator;


public class SmallestValueoftheRearrangedNumber {

    //tactic
    //input쪼개기 -> 
    public long smallestNumber(long num) {
        
        
        long tmp;
        ArrayList<Integer> ls = new ArrayList<Integer>();
        
        tmp = num>0? num:-num;
        
        
        while(tmp>0){
            ls.add((int)(tmp%10));//casting시 변환오류 주의
            tmp = tmp/10;
        }

        tmp=0;
        if(ls.size()==0){
            return 0;
        }
        if(num>=0){
            ls.sort(Comparator.naturalOrder());
            int cnt=0;
            while(ls.get(cnt)==0){
                cnt++;
            }
            tmp = ls.get(cnt);
            for(int i=0; i<cnt; i++){
                tmp*=10;
            }
            for(int i=cnt+1; i<ls.size();i++){
                tmp*=10;
                tmp+=ls.get(i);
            }
        }
        else{
            ls.sort(Comparator.reverseOrder());
            for(int i=0; i<ls.size(); i++){
                tmp *= 10;
                tmp += ls.get(i);
            }
            tmp = tmp*-1;
        }
        return tmp;
        
    }
    
}
