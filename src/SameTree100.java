/**
 * @Author lpf
 * @Date 1/28/18 9:41 PM
 */
public class SameTree100 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (null == p && null == q) {
            return true;
        } else if (null == p || null ==q) {
            return false;
        } else {
            if (p.val == q.val &&
                    isSameTree(p.left, q.left) &&
                    isSameTree(p.right, q.right)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
