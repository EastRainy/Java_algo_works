package algo;

public class SumRoottoLeafNumbers {

    int sum = 0;
    public int sumNumbers(TreeNode root) {

        if(root == null){
            return 0;
        }
        treeVisit(root, 0);

        return sum;
    }
    public void treeVisit(TreeNode node, int data){

        int crr = data*10 + node.val;
        if(node.left==null && node.right==null){
            sum = sum + crr;
            return;
        }
        else{

            if(node.left!=null){
                treeVisit(node.left, crr);
            }
            if(node.right!=null){
                treeVisit(node.right, crr);
            }
        }
    
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
