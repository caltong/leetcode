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
class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        ListNode p = head;
        int len = 0;
        while (p != null) {
            p = p.next;
            len += 1;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }
        k = len - k;
        p = head;
        while (k > 1) {
            p = p.next;
            k -= 1;
        }
        ListNode res = p.next;
        ListNode p2 = p;
        while (p.next != null) {
            p = p.next;
        }
        p.next = head;
        p2.next = null;
        return res;
    }
}

public class RotateRight {
    public static void main(String[] args) {
        Solution61 solution61 = new Solution61();
        ListNode listNode = solution61.rotateRight(ListNodeHelper.listToListNode(new int[]{1, 2}), 2);
        System.out.println(Arrays.toString(ListNodeHelper.listNodeToList(listNode)));
    }
}
