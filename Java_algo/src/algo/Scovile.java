package algo;

import java.util.PriorityQueue;
/*
스코빌 섞기 문제

섞은것 = 제일 안매운 음식 + (두번째로 안매운 음식*2) 으로 계속 계산해서 기준값 이상이 될 수 있는지 없는지, 된다면 몇번만에 되는지 판정하는 문제

==> 항상 최대값, 최소값을 뽑아 사용하는 문제는 우선순위 큐를 기억할것

*/
public class Scovile {
    
    public static void scovile() {
        
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K=7;

        int answer=0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i=0;i<scoville.length;i++){
            queue.add(scoville[i]);
        }

        int r1, r2, newsco;
        while(!isAllReq(queue, K)){
            if(queue.size()==1){
                answer=-1;
                break;
            }  
            r1 = queue.remove();
            r2 = queue.remove();

            newsco = r1 + (r2*2);

            queue.add(newsco);
            answer++;
        }
        System.out.println(answer);
    }

    public static boolean isAllReq(PriorityQueue<Integer> q, int K){
        int tmp = q.peek();
        if(tmp>=K){
            return true;
        }
        else{
            return false;
        }
    }

}   


// 다 풀어놓고 r2*2를 r2*r2라고 생각해서 해멘 문제. 최소/최대값을 꺼내 뭔가를 해야 할 땐 PriorityQueue를 기억하자