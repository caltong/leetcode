package utils;

import java.util.Arrays;
import java.util.LinkedList;

public class ListNodeHelper {
    public static ListNode listToListNode(int[] list) {
        ListNode listNode = new ListNode(list[0]);
        ListNode head = listNode;
        for (int i = 1; i < list.length; i++) {
            listNode.next = new ListNode(list[i]);
            listNode = listNode.next;
        }
        return head;
    }

    public static int[] listNodeToList(ListNode head) {
        LinkedList<Integer> list = new LinkedList<>();
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

    public static void main(String[] args) {
        ListNode listNode = ListNodeHelper.listToListNode(new int[]{1, 2, 3, 4, 5});
        int[] ints = ListNodeHelper.listNodeToList(listNode);
        System.out.println(Arrays.toString(ints));
    }
}
