import utils.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class SolutionInterview0201 {
    public ListNode removeDuplicateNodes(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode previous = head;
        ListNode current = head;
        while (current != null) {
            if (!set.contains(current.val)) {
                set.add(current.val);
                previous = current;
                current = current.next;
            } else {
                previous.next = current.next;
                current = current.next;
            }
        }
        return head;
    }
}

public class RemoveDuplicateNodes {
}
