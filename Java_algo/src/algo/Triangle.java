package algo;

import java.util.List;
public class Triangle {
    

    public int minimumTotal(List<List<Integer>> triangle) {
     
        int t_height = triangle.size();
        int path_min = Integer.MAX_VALUE;
        int left, right;
        
        int[][] mem;
        mem = new int[t_height][];

        for(int i=0; i<t_height; i++){
            mem[i] = new int[i+1];
        }


        for(int t=0; t<t_height; t++){

            List<Integer> crr_List = triangle.get(t);

            if(t==0){
                mem[t][0] = crr_List.get(0);
            }
            else{
                for(int i=0; i<=t;i++){

                    if(i==0){
                        mem[t][i] = mem[t-1][i] + crr_List.get(i);
                    }
                    else if (i==t){
                        mem[t][i] = mem[t-1][i-1] + crr_List.get(i);
                    }
                    else{
                        left = mem[t-1][i] + crr_List.get(i);
                        right = mem[t-1][i-1] + crr_List.get(i);

                        mem[t][i] = (left<right) ? left : right;
                    }
                }
            }
        }
        for(int i=0; i<t_height; i++){
            if(mem[t_height-1][i]<path_min){
                path_min = mem[t_height-1][i];
            }
        }
        return path_min;

    }


}
