/**
 * @Author lpf
 * @Date 1/29/18 11:22 PM
 */
public class IntersectionofTwoLinkedLists160 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        int diff = 0;
        while (null != p && null != q) {
            if (p == q) {
                return p;
            }
            p = p.next;
            q = q.next;
        }

        if (null != p) {
            while (null != p) {
                ++diff;
                p = p.next;
            }
            p = headA;
            q = headB;
        } else if (null != q) {
            while (null != q) {
                ++diff;
                q = q.next;
            }
            p = headB;
            q = headA;
        }

        while (0 != diff) {
            p = p.next;
            --diff;
        }

        while (null != p && null != q) {
            if (p == q) {
                return p;
            }
            p = p.next;
            q = q.next;
        }

        return null;
    }
}
