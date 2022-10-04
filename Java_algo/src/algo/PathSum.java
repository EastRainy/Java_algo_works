package algo;

/* 
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode() {}
*     TreeNode(int val) { this.val = val; }
*     TreeNode(int val, TreeNode left, TreeNode right) {
*         this.val = val;
*         this.left = left;
*         this.right = right;
*     }
* }


public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        
        if(root==null) return false;
        
        return rCal(root, targetSum, 0);
        
        
    }
    
    private boolean rCal(TreeNode node, int targetSum, int treeSum){
        
        int sumThis = treeSum + node.val;
        
        if(node.right == null && node.left == null){
            return targetSum == sumThis ? true : false;
        }
            
        else{
            boolean rCheck = false, lCheck=false;
            
            
            if(node.right!=null) rCheck = rCal(node.right, targetSum, sumThis);
            if(node.left!=null) lCheck = rCal(node.left, targetSum, sumThis);
            
            return rCheck||lCheck;
        }
    }
}
*/