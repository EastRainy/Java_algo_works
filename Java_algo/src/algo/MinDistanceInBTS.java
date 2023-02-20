package algo;

public class MinDistanceInBTS {
    public int minDiffInBST(TreeNode root) {
        

        inorderSearch(root);
        return ans;
        
    }

    
    Integer prev_val = null;
    int ans = Integer.MAX_VALUE;

    private void inorderSearch(TreeNode node){


        if(node==null){
            return;
        }
        
        inorderSearch(node.left);
        if(prev_val != null){
            ans = Math.min(ans, node.val - prev_val);
        }
        prev_val = node.val;
        inorderSearch(node.right);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
        

}
