import utils.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
class Solution142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer.next != null && fastPointer.next.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                ListNode res = head;
                while (res != slowPointer) {
                    res = res.next;
                    slowPointer = slowPointer.next;
                }
                return res;
            }
        }
        return null;
    }
}

public class LinkedListCycle2 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        ListNode res = new Solution142().detectCycle(head);
        System.out.println(res);
    }
}
