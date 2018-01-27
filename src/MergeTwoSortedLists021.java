/**
 * @Author lpf
 * @Date 1/27/18 4:49 PM
 */
public class MergeTwoSortedLists021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        ListNode now;
        ListNode result;
        if (null == p1) {
            return p2;
        } else if (null == p2) {
            return p1;
        } else {
            if (p1.val < p2.val) {
                result = p1;
                now = p1;
                p1 = p1.next;
            } else {
                result = p2;
                now = p2;
                p2 = p2.next;
            }
        }

        while (null != p1 && null != p2) {
            if (p1.val < p2.val) {
                now.next = p1;
                now = p1;
                p1 = p1.next;
            } else {
                now.next = p2;
                now = p2;
                p2 = p2.next;
            }
        }

        if (null != p1) {
            now.next = p1;
        }

        if (null != p2) {
            now.next = p2;
        }

        return result;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
