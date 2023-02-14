package algo;

public class countOdd {

    public int countOdds(int low, int high) {

        if(high-low==0){
            return high%2;
        }else if(high-low==1){
            return 1;
        }

        if(low%2==0) low++;
        if(high%2==0) high--;

        return (high-low)/2 + 1;
        
    }
    
}
