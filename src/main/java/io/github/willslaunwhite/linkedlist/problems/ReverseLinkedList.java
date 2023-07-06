package io.github.willslaunwhite.linkedlist.problems;

import io.github.willslaunwhite.linkedlist.ListNode;

/*
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * 
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * 
 * Input: head = [1,2]
 * Output: [2,1]
 * 
 * Input: head = []
 * Output: []
 */

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
