import utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                result.next = l1;
                result = result.next;
                l1 = l1.next;
            } else {
                result.next = l2;
                result = result.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            result.next = l1;
        } else {
            result.next = l2;
        }
        return head.next;
    }
}


public class MergeTwoLists {
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
        MergeTwoLists link = new MergeTwoLists();
        ListNode l1 = link.generateListNode(new int[]{1, 2, 3});
        ListNode l2 = link.generateListNode(new int[]{1, 3, 4});
        Solution21 sol = new Solution21();
        ListNode result = sol.mergeTwoLists(l1, l2);
        link.printListNode(result);
    }
}
