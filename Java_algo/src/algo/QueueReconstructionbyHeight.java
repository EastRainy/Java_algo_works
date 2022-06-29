package algo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class QueueReconstructionbyHeight {


    public int[][] reconstructQueue(int[][] people) {
        
        
        Arrays.sort(people, new Comparator<int[]>() {
            

            public int compare(int[] o1, int[] o2) {

                if(o1[0] == o2[0]){return o1[1] - o2[1];}
                else{return o2[0] - o1[0];}
            };
        });

        List<int[]> ls = new LinkedList<int[]>();
        
        for(int i=0;i<people.length;i++){
            ls.add(people[i][1], people[i]);
        }
    

        return ls.toArray(new int[people.length][2]);
    }


    
}
