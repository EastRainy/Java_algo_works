package algo;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }

public class LowestCommonAncestor_refactoring {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //작성했던 코드는 너무 길고 조건문 많음
        //좋은 코드 예시 확인하고 압축
        
        if(root==null||root==p||root==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left!=null && right!=null){
            return root;
        }
        return left!=null? left : right;
        
    }
    
}
*/