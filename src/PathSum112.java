/**
 * @Author lpf
 * @Date 1/29/18 9:42 PM
 */
public class PathSum112 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if (null == root) {
            return false;
        }
        if (null == root.left && null == root.right && sum == root.val) {
            return true;
        } else {
            if (null != root.left) {
                root.left.val += root.val;
                if (hasPathSum(root.left, sum)) {
                    return true;
                }
            }
            if (null != root.right) {
                root.right.val += root.val;
                if (hasPathSum(root.right, sum)) {
                    return true;
                }
            }
            return false;
        }
    }
}
