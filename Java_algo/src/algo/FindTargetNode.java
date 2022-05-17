package algo;


//1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
public class FindTargetNode {


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        return rGetNode(cloned, target);
 
    }
    TreeNode rGetNode(TreeNode in, TreeNode target){
        
        if(in.val == target.val){
            return in;
        }else{
            TreeNode le_val, ri_val;
            
            if(in.left!=null){le_val = rGetNode(in.left, target);}
            else{le_val = null;}

            if(in.right!=null){ri_val = rGetNode(in.right, target);}
            else{ri_val = null;}
            
            if(ri_val!=null||le_val!=null){
                return (le_val!=null) ? le_val : ri_val;
            }
            else{
                return null;
            }
            
        }

    }
}
