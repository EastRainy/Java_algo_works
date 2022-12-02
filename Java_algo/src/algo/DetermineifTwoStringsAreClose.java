package algo;
import java.util.Arrays;

public class DetermineifTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        
        if(word1.length() != word2.length()) return false;

        int[] wo1 = new int[26];
        int[] wo2 = new int[26];

        for(int i=0; i<word1.length(); i++){
            int tmp =(int)(word1.charAt(i)-'a');
            wo1[tmp]= wo1[tmp]+1;
            tmp = (int)(word2.charAt(i)-'a');
            wo2[tmp] = wo2[tmp]+1; 
        }

        for(int i=0; i<26; i++){
            if((wo1[i] == 0 && wo2[i] != 0) || (wo1[i] != 0 && wo2[i] == 0)) return false;
        }
        Arrays.sort(wo1);
        Arrays.sort(wo2);
        for(int i=0; i<26; i++){
            if(wo1[i] != wo2[i]) return false;
        }

        return true;
    }
    
}
