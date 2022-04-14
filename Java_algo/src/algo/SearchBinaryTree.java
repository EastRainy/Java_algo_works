package algo;


class SearchBinaryTree{

    /*
        Find and return subtree where node.val = val input in binary tree
        if there are no node equal value, 

    */

    public class TreeNode {
        //given binary tree definition
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
    public TreeNode searchbinarytree(TreeNode root, int val){


        TreeNode now;

        now = root;
        while(now!=null){
            if(now.val==val){
                break;
            }
            else if(now.val>val){
                now = now.left;
            }
            else{
                now = now.right;
            }
        }

        return now;
    }

}
