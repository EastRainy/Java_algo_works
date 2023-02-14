package algo;

public class AddBinary {

    public String addBinary(String a, String b) {


        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder ans = new StringBuilder();
        int cnt = 0;


        while (i >= 0 || j >= 0 || cnt != 0) {

            if (i >= 0) {
                cnt += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                cnt += b.charAt(j) - '0';
                j--;
            }
            

            /* 
             * if cnt==0
             *  0  0  => cnt = 0   --> cnt%2=0, cnt/2=0
             *  1  0  => cnt = +   --> cnt%2=1, cnt/2=0
             *  0  1  => cnt = +   --> cnt%2=1, cnt/2=0
             *  1  1  => cnt = ++  --> cnt%2=2, cnt/2=1
             */

            ans.append(cnt % 2);
            
            cnt = cnt / 2;
        }

        return ans.reverse().toString();


    }
    
}
