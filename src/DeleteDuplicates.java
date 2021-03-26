import utils.ListNode;
import utils.ListNodeHelper;

import java.util.Arrays;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;
        while (p2 != null) {
            while (p2 != null && p1.val == p2.val) {
                p2 = p2.next;
                p1.next = p2;
            }
            if (p2 == null) {
                break;
            } else {
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return head;
    }
}

public class DeleteDuplicates {
    public static void main(String[] args) {
        ListNode l1 = ListNodeHelper.listToListNode(new int[]{1, 1, 1, 2, 2, 3, 3, 3, 3, 3});
        Solution83 sol = new Solution83();
        ListNode result = sol.deleteDuplicates(l1);
        System.out.println(Arrays.toString(ListNodeHelper.listNodeToList(result)));
    }
}
