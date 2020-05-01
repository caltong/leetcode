import utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode1 = null;
        ListNode listNode2 = null;
        while (l1 != null) {
            ListNode temp = new ListNode(l1.val);
            l1 = l1.next;
            temp.next = listNode1;
            listNode1 = temp;

        }
        while (l2 != null) {
            ListNode temp = new ListNode(l2.val);
            l2 = l2.next;
            temp.next = listNode2;
            listNode2 = temp;
        }
        ListNode result = null;
        Integer carry = 0;
        while (listNode1 != null || listNode2 != null) {
            if (listNode1 != null && listNode2 != null) {
                ListNode temp = new ListNode(listNode1.val + listNode2.val + carry);
                listNode1 = listNode1.next;
                listNode2 = listNode2.next;
                carry = 0;
                if (temp.val >= 10) {
                    temp.val = temp.val - 10;
                    carry = 1;
                }
                temp.next = result;
                result = temp;
            } else if (listNode2 == null) {
                ListNode temp = new ListNode(listNode1.val + carry);
                listNode1 = listNode1.next;
                carry = 0;
                if (temp.val >= 10) {
                    temp.val = temp.val - 10;
                    carry = 1;
                }
                temp.next = result;
                result = temp;
            } else {
                ListNode temp = new ListNode(listNode2.val + carry);
                listNode2 = listNode2.next;
                carry = 0;
                if (temp.val >= 10) {
                    temp.val = temp.val - 10;
                    carry = 1;
                }
                temp.next = result;
                result = temp;
            }
        }
        if (carry == 1) {
            ListNode temp = new ListNode(1);
            temp.next = result;
            result = temp;
        }
        return result;
    }
}

public class AddTwoNumbers2 {
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
        AddTwoNumbers2 link = new AddTwoNumbers2();
        ListNode l1 = link.generateListNode(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        ListNode l2 = link.generateListNode(new int[]{9, 3, 4, 5, 6, 7, 8, 9, 0});
        link.printListNode(l1);
        link.printListNode(l2);
        Solution445 solution445 = new Solution445();
        ListNode listNode = solution445.addTwoNumbers(l1, l2);
        link.printListNode(listNode);

    }
}

