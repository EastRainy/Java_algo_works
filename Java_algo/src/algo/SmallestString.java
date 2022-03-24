
package algo;


public class SmallestString {
    public String getSmallestString(int n, int k) {
        
        StringBuilder ans = new StringBuilder();
    


        while(n>0){

            if(k<=n){

                ans.append('a');
                k--;
                n--;
            }
            else{

                System.out.print(k + ", "+ n + " => " );

                if(k-n>=26){
                    System.out.println('z');
                    ans.append('z');
                    k = k-26;
                    n--;
                }
                else{
                    System.out.println((char)('a'+(k-n)));
                    ans.append((char)('a'+(k-n)));
                    k = k - (k- n + 1);
                    n--;
                }


            }
        }

        ans.reverse();
    
        return ans.toString();
        
    }
    
}