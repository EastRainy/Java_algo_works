package algo;

public class ReverseVowelsofaString {

    public String reverseVowels(String s) {
        
        int i = 0, j = s.length()-1;
        char tmp;
        StringBuilder ans = new StringBuilder(s);
        while(i<j){
            tmp = '!';
            for(;i<j;i++){
                switch(s.charAt(i)){
                    case 'a','e','i','o','u','A','E','I','O','U' :
                        tmp = s.charAt(i);
                        break;
                    default :
                        continue;
                }
                if(tmp!='!') break;
            }
            if(i>=j) break;
            for(;j>i; j--){
                switch(s.charAt(j)){
                    case 'a','e','i','o','u','A','E','I','O','U' :
                        ans.setCharAt(i, s.charAt(j));
                        ans.setCharAt(j, tmp);
                        break;
                    default :
                        continue;
                }
                if(tmp!='!') break;
            }
            if(i<j){
                i++;
                j--;
            }
        }

        return ans.toString();
    }
    
}
