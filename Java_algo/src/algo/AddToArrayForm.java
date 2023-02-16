package algo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AddToArrayForm {

    public List<Integer> addToArrayForm(int[] num, int k) {

        int cnt=0, tmp=0;
        List<Integer> ans = new ArrayList<Integer>();
        
        for(int i=num.length-1;i>=0;i--){

            tmp = num[i] + k%10 + cnt;
            cnt=0;

            
            if(tmp>=10){
                cnt = 1;
                tmp = tmp-10;
            }
            k = k/10;
            ans.add(tmp);
        }
        
        if(k>0){
            k = k+cnt;
            cnt = 0;
            while(k>0){
                ans.add(k%10);
                k = k/10;
            }
        }
        if(cnt==1){
            ans.add(1);
        }

        Collections.reverse(ans);

        return ans;

        
    }
    
}
