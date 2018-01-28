/**
 * @Author lpf
 * @Date 1/29/18 12:03 AM
 */
public class RemoveDuplicatesfromSortedList083 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode p, q;
        p = head;
        while (null != p) {
            while (null != p.next && p.val != p.next.val) {
                p = p.next;
            }
            if (null == p.next) {
                return head;
            }
            q = p.next;
            while (null != q.next && q.val == q.next.val) {
                q = q.next;
            }
            q = q.next;
            p.next = q;
        }
        return head;
    }
}
