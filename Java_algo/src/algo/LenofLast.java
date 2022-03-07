package algo;


class LenofLast{


    public static void LenofLast(){

        System.out.println(lengthOfLastWord("Hello World"));

    }

    public static int lengthOfLastWord(String s) {

        int ans;

        String[] spl = s.split(" ");

        ans = spl[spl.length-1].length();


        return ans;
    }


}