package algo;

public class BrokenCalc{

    public int brokenCalc(int startValue, int target) {
        
        int count=0;
        
        while(target!=startValue){

            if(target>startValue){
                
                if(target%2==0){

                    target = target/2;
                }
                else{
                    target++;
                }

                count++;
            }
  
        }

        return count;
        
    }


}