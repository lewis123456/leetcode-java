/**
 * @Author lpf
 * @Date 1/28/18 10:06 PM
 */
public class BalancedBinaryTree110 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    //todo
    public boolean isBalanced(TreeNode root) {
        if (null == root) {
            return true;
        } else {
            if (null == root.left &&
                    (null != root.right &&
                            !(null == root.right.left && null == root.right.right))) {
                return false;
            }
            if (null == root.right &&
                    (null != root.left &&
                    !(null == root.left.left && null == root.left.right))) {
                return false;
            }
            return (isBalanced(root.left) && isBalanced(root.right));
        }
    }
}
