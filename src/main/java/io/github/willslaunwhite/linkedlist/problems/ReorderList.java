package io.github.willslaunwhite.linkedlist.problems;

import io.github.willslaunwhite.linkedlist.ListNode;

/*
 * need to refactor so there's no return
 */

public class ReorderList {
    public ListNode reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = slow.next;
        ListNode prev = slow.next = null;
        while (secondHalf != null) {
            ListNode next = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = next;
        }
        ListNode firstHalf = head;
        secondHalf = prev;
        while (secondHalf != null) {
            ListNode tempFirst = firstHalf.next;
            ListNode tempSecond = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = tempFirst;
            firstHalf = tempFirst;
            secondHalf = tempSecond;
        }
        return head;
    }
}