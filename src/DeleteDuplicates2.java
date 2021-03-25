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
class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p1 = new ListNode(-101);
        p1.next = head;
        ListNode dummyHead = p1;
        ListNode p2 = head;
        ListNode p3 = head.next;
        while (p3 != null) {
            if (p3.val != p2.val) {
                p1 = p2;
                p2 = p3;
                p3 = p3.next;
            } else {
                while (p3 != null && p3.val == p2.val) {
                    p2 = p3;
                    p3 = p3.next;
                }
                if (p3 != null) {
                    p1.next = p3;
                    p2 = p3;
                    p3 = p3.next;
                } else {
                    p1.next = null;
                }
            }
        }
        return dummyHead.next;
    }
}

public class DeleteDuplicates2 {
    public static void main(String[] args) {
        Solution82 solution82 = new Solution82();
        ListNode listNode = ListNodeHelper.listToListNode(new int[]{1, 2, 3, 3, 4, 4, 5});
        listNode = solution82.deleteDuplicates(listNode);
        System.out.println(Arrays.toString(ListNodeHelper.listNodeToList(listNode)));
    }
}
