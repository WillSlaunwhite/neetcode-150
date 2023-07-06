package io.github.willslaunwhite.linkedlist.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.willslaunwhite.linkedlist.ListNode;
import io.github.willslaunwhite.linkedlist.problems.ReverseLinkedList;

public class ReverseLinkedListTest {
    private ReverseLinkedList solution;
    private ListNode head;

    @BeforeEach
    public void setUp() {
        solution = new ReverseLinkedList();
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        head = new ListNode(1, node2);
    }

    @Test
    public void testReverseLinkedListRecursive() {
        ListNode reversedHeadRecursive = solution.reverseLinkedListRecursive(head);

        assertEquals(3, reversedHeadRecursive.val);
        assertEquals(2, reversedHeadRecursive.next.val);
        assertEquals(1, reversedHeadRecursive.next.next.val);
    }

    @Test
    public void testReverseLinkedListIterative() {
        ListNode reversedHeadRecursive = solution.reverseLinkedListIterative(head);

        assertEquals(3, reversedHeadRecursive.val);
        assertEquals(2, reversedHeadRecursive.next.val);
        assertEquals(1, reversedHeadRecursive.next.next.val);
    }
}
