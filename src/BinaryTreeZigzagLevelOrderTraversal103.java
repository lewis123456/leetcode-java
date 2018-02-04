import java.util.ArrayList;
import java.util.List;

/**
 * @Author lpf
 * @Date 2/4/18 10:41 PM
 */
public class BinaryTreeZigzagLevelOrderTraversal103 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == root) {
            return result;
        } else {
            List<Integer> pre = new ArrayList<>();
            List<TreeNode> preNode = new ArrayList<>();
            pre.add(root.val);
            preNode.add(root);
            result.add(pre);
            boolean order = false;
            while (true) {
                List<Integer> now = new ArrayList<>();
                List<TreeNode> nowNode = new ArrayList<>();
                for (TreeNode temp : preNode) {
                    if (null != temp.left) {
                        now.add(temp.left.val);
                        nowNode.add(temp.left);
                    }
                    if (null != temp.right) {
                        now.add(temp.right.val);
                        nowNode.add(temp.right);
                    }
                }
                preNode = nowNode;
                if (0 == now.size()) {
                    return result;
                } else {
                    if (!order) {
                        for (int i=0; i<now.size()/2; ++i) {
                            int temp = now.get(i);
                            now.set(i, now.get(now.size()-i-1));
                            now.set(now.size()-i-1, temp);
                        }
                    }
                    result.add(now);
                    order = !order;
                }
            }
        }
    }
}
