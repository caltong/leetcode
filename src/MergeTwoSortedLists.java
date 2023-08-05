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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                result.next = list1;
                result = result.next;
                list1 = list1.next;
            } else {
                result.next = list2;
                result = result.next;
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            result.next = list1;
        } else {
            result.next = list2;
        }
        return head.next;
    }
}


public class MergeTwoSortedLists {
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
        MergeTwoSortedLists link = new MergeTwoSortedLists();
        ListNode l1 = link.generateListNode(new int[]{1, 2, 3});
        ListNode l2 = link.generateListNode(new int[]{1, 3, 4});
        Solution21 sol = new Solution21();
        ListNode result = sol.mergeTwoLists(l1, l2);
        link.printListNode(result);
    }
}
