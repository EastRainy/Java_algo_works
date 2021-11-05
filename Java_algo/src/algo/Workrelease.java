package algo;

import java.util.ArrayList;

public class Workrelease {
    
    public static void main(String[] args) {
        int[] answer;
        int[] progresses ={93, 30, 55};
        int[] speeds ={1,30,5};
        ArrayList<Integer> donelist = new ArrayList<Integer>();

        int today_prog;
        int done=0;
        int totalwork=progresses.length;

        while(done<totalwork){
            today_prog = 0;
            todayWork(progresses, speeds, done);
            
            today_prog = rel_check(progresses, done);

            if(today_prog==0){
                continue;
            }
            donelist.add(today_prog);

            done = done+today_prog;
        }

        answer = new int[donelist.size()];


        for(int i=0; i<donelist.size();i++){
            answer[i] = donelist.get(i);
        }
        for(int i=0;i<answer.length;i++){
            System.out.print(answer[i]+" ");
        }

    }

    static void todayWork(int[] p, int[] s, int stindex){

        for(int i=stindex;i<p.length;i++){
            if(p[i]<100){
                p[i] = p[i]+s[i];
            }
        }
    }
    static int rel_check(int[] p, int stindex){
        int cnt=0;

        for(int i=stindex; i<p.length;i++){
            if(p[i] >=100){
                cnt++;
            }
            else{
                break;
            }
        }
        return cnt;
    }

}
