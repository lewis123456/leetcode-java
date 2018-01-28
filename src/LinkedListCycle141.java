/**
 * @Author lpf
 * @Date 1/28/18 11:15 PM
 */
public class LinkedListCycle141 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
    public boolean hasCycle(ListNode head) {
        ListNode p, q;
        p = q = head;
        while (p != null && q != null) {
            p = p.next;
            if (null != q.next) {
                q = q.next.next;
            } else {
                return false;
            }
            if (p == q && null != p) {
                return true;
            }
        }
        return false;
    }
}
