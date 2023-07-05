package io.github.willslaunwhite.linkedlist.problems;

import io.github.willslaunwhite.linkedlist.ListNode;

public class ReverseLinkedList {
    public ListNode reverseLinkedListIterative(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public ListNode reverseLinkedListRecursive(ListNode head) {
        return this.reverse(head, null);
    }

    public ListNode reverse(ListNode current, ListNode prev) {
        if (current == null) {
            return prev;
        }
        ListNode next = current.next;
        current.next = prev;
        return this.reverse(next, current);
    }
}
