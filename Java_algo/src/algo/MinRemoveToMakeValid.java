package algo;



class MinRemoveToMakeValid{

    // ( ) 괄호 유효하게 스트링 만드는 문제
    public String minRemoveToMakeValid(String s){

        StringBuilder ans = new StringBuilder();
        int open=0;
        char tmp;

        ans.append(s);
        
        for(int i=0; i<ans.length();i++){

            tmp = ans.charAt(i);
            if(tmp=='('){
                open++;
            }
            else if(tmp==')'){
                if(open<=0){
                    ans.deleteCharAt(i);
                    i--;
                }
                else{
                    open--;
                }
            }
        }
        for(int i=ans.length()-1;i>=0;i--){
            if(open<=0){
                break;
            }
            if(ans.charAt(i)=='('){
                ans.deleteCharAt(i);
                open--;
            }

        }
        return ans.toString();
    }


}