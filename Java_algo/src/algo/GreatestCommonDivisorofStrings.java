package algo;

public class GreatestCommonDivisorofStrings {
    

    public String gcdOfStrings(String str1, String str2) {
        

        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        
        int gcd = getGcd(str1.length(), str2.length());

        return str1.substring(0, gcd);

    }
    int getGcd(int l1, int l2){//유클리드 호제법
        
        if(l2 == 0) return l1;

        else{
            return getGcd(l2, l1%l2);
        }
    }

}
