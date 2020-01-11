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
        ListNode dummyHead = head;
        ListNode target = head;
        while (head.next != null) {
            while (head.val == target.val && target.next != null) {
                target = target.next;
            }
            if (head.val == target.val) {
                head.next = null;
            } else {
                head.next = target;
                head = head.next;
            }
        }
        return dummyHead;
    }
}

public class DeleteDuplicates {
    private ListNode generateListNode(int[] ints) {
        ListNode aListNode = new ListNode(0);
        ListNode head = aListNode;
        for (int val : ints) {
            aListNode.next = new ListNode(val);
            aListNode = aListNode.next;
        }
        return head.next;
    }

    private void printListNode(ListNode aListNode) {
        while (aListNode != null) {
            System.out.print(aListNode.val + "-->");
            aListNode = aListNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteDuplicates link = new DeleteDuplicates();
        ListNode l1 = link.generateListNode(new int[]{1, 1, 1, 2, 2, 3, 3, 3, 3, 3});
        Solution83 sol = new Solution83();
        ListNode result = sol.deleteDuplicates(l1);
        link.printListNode(result);
    }
}
