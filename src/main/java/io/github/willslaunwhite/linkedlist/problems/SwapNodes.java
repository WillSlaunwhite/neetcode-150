package io.github.willslaunwhite.linkedlist.problems;

import io.github.willslaunwhite.linkedlist.ListNode;

public class SwapNodes {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head, right = head;
        while (k > 1) {
            right = right.next;
            k--;
        }
        ListNode dummy = right;
        while (dummy.next != null) {
            left = left.next;
            dummy = dummy.next;
        }
        int temp = right.val;
        right.val = left.val;
        left.val = temp;

        return head;

    }
}