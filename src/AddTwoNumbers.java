import java.util.spi.AbstractResourceBundleProvider;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        while (true) {
            int tmp = result.val;
            if (l1 != null) {
                tmp += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                tmp += l2.val;
                l2 = l2.next;
            }
            int add = 0;
            add = tmp / 10;
            result.val = tmp % 10;
            if (add != 0) {
                result.next = new ListNode(add);
            }
            if (l1 == null && l2 == null) {
                break;
            }
            if (add == 0) {
                result.next = new ListNode(add);
            }
            result = result.next;

        }
        return head;
    }
}

public class AddTwoNumbers {
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
        AddTwoNumbers link = new AddTwoNumbers();
        ListNode l1 = link.generateListNode(new int[]{9, 2, 3, 2});
        ListNode l2 = link.generateListNode(new int[]{1, 3, 4});
        Solution2 sol = new Solution2();
        ListNode result = sol.addTwoNumbers(l1, l2);
        link.printListNode(result);
    }
}
