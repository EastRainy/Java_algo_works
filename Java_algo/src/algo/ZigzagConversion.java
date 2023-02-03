package algo;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        
        int check = 0, idx = 0;

        if(numRows==1){
            return s;
        }
    

        StringBuilder[] stb = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            stb[i] = new StringBuilder();
        }

        for(int i=0; i<s.length(); i++){
            
            if(check==0){
                stb[idx].append(s.charAt(i));
                idx++;
                if(idx>=numRows-1){
                   check = 1; 
                }

            }
            else{
                stb[idx].append(s.charAt(i));
                idx--;
                if(idx<=0){
                   check = 0; 
                }
            }

        }

        for(int i=1; i<numRows; i++){
            stb[0].append(stb[i].toString());
        }


        return stb[0].toString();

    }
    
}
