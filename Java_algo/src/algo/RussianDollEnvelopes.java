package algo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/*

TODO Prob

You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi] represents the width and the height of an envelope.
One envelope can fit into another if and only if both the width and height of one envelope are greater than the other envelope's width and height.
Return the maximum number of envelopes you can Russian doll (i.e., put one inside the other).

Note: You cannot rotate an envelope.

*/

public class RussianDollEnvelopes {

    /*
        원하는 해결법
        1. 주어진 envelopes를 정렬, 혹은 트리를 이용하여 구별
        2. 현재 크기, 높이를 memory하고 정제된 envelopes를 이용하여 집어넣기 가능 횟수 계산

    */
    

    public int maxEnvelopes(int[][] envelopes) {
        
        int ans=0, m_min = Integer.MIN_VALUE, m_max = Integer.MAX_VALUE;

/*
        //1. 중복제거
        //크기가 같은 인형은 넣을때 한개만 넣을 수 있으므로 중복사항은 제거한다

        HashSet<int[]> h = new HashSet<int[]>();

        for(int i=0; i<envelopes.length; i++){h.add(envelopes[i]);}
        int[][] r_env = h.toArray(new int[0][0]);
*/

        Arrays.sort(envelopes, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if(o1[0]!=o2[0]){
                    return o1[0]-o2[0];
                }
                else{
                    return o2[1]-o1[1];
                }
            };
        });
        
        System.out.println(Arrays.deepToString(envelopes));

        


        return ans;
    }


    

}


