package algo;

public class DeleteColumnstoMakeSorted {
    public int minDeletionSize(String[] strs) {
        
        int ans = 0;
        for(int i=0; i<strs[0].length(); i++){
            
            if(!checkThisLexicographi(strs, i)) ans++;

        }

        return ans;


    }
    private boolean checkThisLexicographi(String[] strs, int p){

        for(int i=1; i<strs.length; i++){
            if(strs[i-1].charAt(p)>strs[i].charAt(p)) return false;
        }
        return true;

    }
    
}
