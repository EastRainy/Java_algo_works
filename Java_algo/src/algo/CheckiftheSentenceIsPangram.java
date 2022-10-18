package algo;

import java.util.Hashtable;
import java.lang.Character;

public class CheckiftheSentenceIsPangram {
    
    public boolean checkIfPangram(String sentence) {
        
        
        Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
        
        for(char i = 'a'; i<='z'; i++){
            ht.put(i,0);
        }
        
        for(int i=0; i<sentence.length(); i++){
            ht.put(sentence.charAt(i),1);
        }
        
        
        for(int x : ht.values()){
            if(x==0){
                return false;
            }
        }

        return true;
        
    }
}
