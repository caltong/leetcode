import utils.ListNode;
import utils.ListNodeHelper;

import java.util.Arrays;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode current = pre.next;
        ListNode next;
        for (int i = 0; i < right - left; i++) {
            next = current.next;
            current.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return dummyHead.next;
    }
}

public class ReverseBetween {
    public static void main(String[] args) {
        Solution92 solution92 = new Solution92();
        ListNode listNode = ListNodeHelper.listToListNode(new int[]{2, 3});
        ListNode listNode1 = solution92.reverseBetween(listNode, 1, 2);
        int[] ints = ListNodeHelper.listNodeToList(listNode1);
        System.out.println(Arrays.toString(ints));
    }
}
