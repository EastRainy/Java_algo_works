package algo;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinations {

    class TreeNode{
        char crr;
        TreeNode leftNode, middleNode, rightNode, exepNode;

        public TreeNode(String digits, int w){

            if(digits.length()>0){
                crr = (char)(keypad(digits.charAt(0))+w);

                if(digits.length()>1){
                    String tmp = digits.substring(1);
                    leftNode = new TreeNode(tmp, 0);
                    middleNode = new TreeNode(tmp, 1);
                    rightNode = new TreeNode(tmp, 2);
                    if(tmp.charAt(0)=='7'||(tmp.charAt(0)=='9')){
                        exepNode = new TreeNode(tmp, 3);
                    }
                    else{
                        exepNode = null;
                    }
                }
                else{
                    leftNode = null;
                    middleNode = null;
                    rightNode = null;
                    exepNode = null;
                }
            }
        }
        public List<String> returnString(){


            List<String> ans = new LinkedList<String>();

            if(leftNode!=null){
                List<String> ansL = leftNode.returnString();
                for(int i=0; i<ansL.size(); i++){
                    ans.add(crr+(ansL.get(i)).toString());
                }
                List<String> ansM = middleNode.returnString();
                for(int i=0; i<ansM.size(); i++){
                    ans.add(crr+(ansM.get(i)).toString());
                }
                List<String> ansR = rightNode.returnString();
                for(int i=0; i<ansR.size(); i++){
                    ans.add(crr+(ansR.get(i)).toString());
                }
                if(exepNode!=null){
                    List<String> ansE = exepNode.returnString();
                    for(int i=0; i<ansE.size(); i++){
                        ans.add(crr+(ansE.get(i)).toString());
                    }
                }

            }
            else{
                ans.add(""+crr);
            }
            
            return ans;

        }        
    }
    public char keypad(char c){
        int input = Integer.parseInt(""+c);
        char ans = (char)('a'+(input-2)*3);
        if(input>7){ans++;}
        return ans;
    }


    public List<String> letterCombinations(String digits){


        TreeNode[] root = new TreeNode[4];
        List<String> ans = new LinkedList<String>();

        if(digits.length()<=0){
            return ans;
        }
        else{
            for(int i=0; i<3; i++){
                root[i] = new TreeNode(digits, i);
            }
            if(digits.charAt(0)=='7'||digits.charAt(0)=='9'){
                root[3] = new TreeNode(digits, 3);
            }
            else{
                root[3]=null;
            }

            ans.addAll(root[0].returnString());
            ans.addAll(root[1].returnString());
            ans.addAll(root[2].returnString());
            if(root[3]!=null){
                ans.addAll(root[3].returnString());
            }
    
            return ans;
        }
    }
    
}
