package algo;

public class PartitioningIntoMinNumofDeciBinary {

    public int minPartitions(String n) {
        
        int max=0;

        for(int i=0; i<n.length(); i++){
            if(max<(int)(n.charAt(i)-'0')){
                max = (int)(n.charAt(i)-'0');
            }
        }
        return max;
    }
    
}
