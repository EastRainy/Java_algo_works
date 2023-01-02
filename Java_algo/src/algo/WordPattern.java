package algo;

import java.util.Hashtable;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        
        Hashtable<Character, String> ht = new Hashtable<Character, String>();
        char tmp;

        String[] s_cut = s.split(" ");

        if(pattern.length() != s_cut.length) return false;

        for(int i=0; i<pattern.length(); i++){
            tmp = pattern.charAt(i);

            if(ht.get(tmp)==null){

                if(ht.contains(s_cut[i])) return false;
                ht.put(tmp, s_cut[i]);

            }
            else{
                if(ht.get(tmp).equals(s_cut[i])){


                    continue;
                }
                else{return false;}
            }
        }


        return true;

    }
}
    

