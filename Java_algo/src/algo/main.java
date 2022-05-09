package algo;

import java.util.List;

public class Main{
    
    public static void main(String[] args){


        
        List<String> ans = new LetterCombinations().letterCombinations("9");

        System.out.println(ans.size());
        for(int i=0; i<ans.size();i++){
            System.out.print(ans.get(i) +" ");
        }
        
    }

}
