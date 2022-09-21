
package algo;

//import java.util.HashSet;

class PseudoPalindromicPaths {
    /*
    public int pseudoPalindromicPaths (TreeNode root) {
       
       HashSet<Integer> hs = new HashSet<Integer>();
       return countRoutePesudo(root, hs);
   }
   
   private int countRoutePesudo(TreeNode node, HashSet<Integer> hs){
   
       int ans = 0;

       if(node==null) return 0;

       if(hs.contains(node.val)){hs.remove(node.val);}
       else{hs.add(node.val);}

       if(node.right==null && node.left==null){
           if(hs.size()<=1) return 1;
           else return 0;
       }
       if(node.right!=null) ans += countRoutePesudo(node.right, new HashSet(hs));
       if(node.left!=null) ans += countRoutePesudo(node.left, new HashSet(hs));


       if(hs.contains(node.val)){hs.remove(node.val);}
       else{hs.add(node.val);}

       return ans;
   }
   */
}