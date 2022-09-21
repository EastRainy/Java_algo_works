package algo;
/*
import java.util.LinkedList;
import java.util.List;


 * Return values of node when can see right side of binary tree
 * 노드를 오른쪽 옆에서 봤을때 보이는 이진트리 노드들의 값 
 * 



public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans = new LinkedList<Integer>();
        int height=0;

        isView(root, ans, height);

        return ans;
        
    }
    public void isView(TreeNode crr, List<Integer> ls, int height){

        if(crr==null){
            return;
        }

        if(ls.size() == height){
            ls.add(crr.val);
        }

        isView(crr.right, ls, height+1);
        isView(crr.left, ls, height+1);

    }

}
 */
/* 
class TreeNode {
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
*/