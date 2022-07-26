package algo;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
             
        return rFindNodes(root, p, q);
        
    }
    TreeNode rFindNodes(TreeNode crr, TreeNode p, TreeNode q){
        
        TreeNode rN, lN;

        if(crr.right!=null){
            rN = rFindNodes(crr.right, p, q);
        }
        else{
               rN=null;
            }
        if(crr.left!=null){
            lN = rFindNodes(crr.left, p, q);
        }
        else{
            lN=null;
        }
        if(rN!=null && lN!=null){
            return crr;
        }
        else if(rN==null&&lN!=null){
            if((crr.val == p.val || crr.val == q.val) && (lN.val == p.val || lN.val == q.val)){
                return crr;
            }
            else{
                return lN;
            }         
        }
        else if(rN!=null && lN==null){
            if((rN.val == p.val || rN.val == q.val) && (crr.val == p.val || crr.val == q.val)){
                return crr;
            }
            else{
                return rN;
            }
        }
        else{
            if(crr.val==p.val || crr.val == q.val){
                return crr;
            }
            else{
                return null;
            }
        }    
    }
    
}


/*
 * 다 풀어놓고 조건식이 안맞아서 예외 발생
 * 
 * || 와 && 가 섞인 조건문을 쓸 때는 순서를 지키거나 ( ) 로 꼭 묶어서 확실하게 처리할것
 * 
 */