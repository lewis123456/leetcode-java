/**
 * @Author lpf
 * @Date 1/28/18 10:01 PM
 */
public class MaximumDepthofBinaryTree104 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        } else {
            int left = 1 + maxDepth(root.left);
            int right = 1 + maxDepth(root.right);
            return left > right ? left : right;
        }
    }
}
