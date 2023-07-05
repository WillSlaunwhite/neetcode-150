package io.github.willslaunwhite.linkedlist.tests.reverseLinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.github.willslaunwhite.linkedlist.ListNode;
import io.github.willslaunwhite.linkedlist.problems.ReverseLinkedList;

public class ReverseLinkedListTest {

    @Test
    public void testReverseLinkedListRecursive() {
        ReverseLinkedList solution = new ReverseLinkedList();

        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        ListNode reversedHeadRecursive = solution.reverseLinkedListRecursive(head);

        assertEquals(3, reversedHeadRecursive.val);
        assertEquals(2, reversedHeadRecursive.next.val);
        assertEquals(1, reversedHeadRecursive.next.next.val);
    }

    @Test
    public void testReverseLinkedListIterative() {
        ReverseLinkedList solution = new ReverseLinkedList();

        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        ListNode reversedHeadRecursive = solution.reverseLinkedListIterative(head);

        assertEquals(3, reversedHeadRecursive.val);
        assertEquals(2, reversedHeadRecursive.next.val);
        assertEquals(1, reversedHeadRecursive.next.next.val);
    }
}
