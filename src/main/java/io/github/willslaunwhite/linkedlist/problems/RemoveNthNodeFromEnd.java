package io.github.willslaunwhite.linkedlist.problems;

import io.github.willslaunwhite.linkedlist.ListNode;

public class RemoveNthNodeFromEnd {
    public ListNode removeNthNodeFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode right = head;
        ListNode dummy = new ListNode(0, head);
        while (n > 0) {
            right = right.next;
            n--;
        }

        ListNode left = dummy;
        while (right != null) {
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;

        return dummy.next;
    }
}