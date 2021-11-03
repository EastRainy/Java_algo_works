package algo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;


public class DiskController {
    

    public static void main(String[] args) {
        
        int[][] jobs = {{2, 6},{0, 3}, {1, 9}};
        int answer = 0;
      
        Arrays.sort(jobs, new Comparator<int[]>() {

            public int compare(int[] o1, int[] o2) {

                return o1[0]-o2[0];
            }
        });
        
      






        System.out.println(answer);
    }


}
