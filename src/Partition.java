import utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution86 {
    public ListNode partition(ListNode head, int x) {
        ListNode smaller = new ListNode(0);
        ListNode smallerHead = smaller;
        ListNode bigger = new ListNode(0);
        ListNode biggerHead = bigger;
        while (head != null) {
            if (head.val < x) {
                smaller.next = new ListNode(head.val);
                smaller = smaller.next;
            } else {
                bigger.next = new ListNode(head.val);
                bigger = bigger.next;
            }
            head = head.next;
        }
        smaller.next = biggerHead.next;
        return smallerHead.next;
    }
}

public class Partition {
    public static void main(String[] args) {
        Solution86 solution86 = new Solution86();
    }
}
