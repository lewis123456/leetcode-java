/**
 * @Author lpf
 * @Date 1/30/18 11:41 PM
 */
public class MinimumDepthofBinaryTree111 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public int minDepth(TreeNode root) {
        if (null == root) {
            return 0;
        } else if (null == root.left && null == root.right) {
            return 1;
        } else if (null == root.left) {
            return 1 + minDepth(root.right);
        } else if (null == root.right) {
            return 1 + minDepth(root.left);
        } else {
            int left = 1 + minDepth(root.left);
            int right = 1 + minDepth(root.right);
            return left < right ? left : right;
        }
    }
}
