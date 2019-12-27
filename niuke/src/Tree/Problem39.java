package Tree;

import utils.TreeNode;

/**
 * 二叉树的深度
 */
public class Problem39 {
    public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        return Math.max(left,right)+1;
    }
}
