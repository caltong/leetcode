import utils.ListNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class SolutionOffer06 {
    public int[] reversePrint(ListNode head) {
        ListNode p1;
        ListNode p2;
        if (head == null) {
            return new int[]{};
        } else if (head.next == null) {
            return new int[]{head.val};
        }
        p1 = head.next;
        p2 = head.next.next;
        head.next = null;
        while (p2 != null) {
            p1.next = head;
            head = p1;
            p1 = p2;
            p2 = p2.next;
        }
        p1.next = head;
        head = p1;
        List<Integer> list = new LinkedList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}

public class ReversePrint {
    public static void main(String[] args) {
        SolutionOffer06 solutionOffer06 = new SolutionOffer06();
        ListNode listNode = new ListNode(-1);
        ListNode head = listNode;
        for (int i = 0; i < 10; i++) {
            listNode.next = new ListNode(i);
            listNode = listNode.next;
        }
        int[] res = solutionOffer06.reversePrint(head.next);
        System.out.println(Arrays.toString(res));
    }
}
