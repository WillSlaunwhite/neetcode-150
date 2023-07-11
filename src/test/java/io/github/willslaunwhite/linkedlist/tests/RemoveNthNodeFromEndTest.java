package io.github.willslaunwhite.linkedlist.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.willslaunwhite.linkedlist.ListNode;
import io.github.willslaunwhite.linkedlist.problems.RemoveNthNodeFromEnd;

public class RemoveNthNodeFromEndTest {
    private RemoveNthNodeFromEnd solution;
    private ListNode head;

    @BeforeEach
    public void setUp() {
        solution = new RemoveNthNodeFromEnd();
    }

    @Test
    public void testRemoveNthNodeFromEndFirstCase() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);

        head = new ListNode(1, node2);
        ListNode editedList = solution.removeNthNodeFromEnd(head, 2);
        assertEquals(1, editedList.val);
        assertEquals(2, editedList.next.val);
        assertEquals(3, editedList.next.next.val);
        assertEquals(5, editedList.next.next.next.val);
    }

    @Test
    public void testRemoveNthNodeFromEndSecondCase() {
        head = new ListNode(1);
        ListNode editedList = solution.removeNthNodeFromEnd(head, 1);

        assertNull(editedList);
    }

    @Test
    public void testRemoveNthNodeFromEndThirdCase() {
        ListNode node2 = new ListNode(2);
        head = new ListNode(1, node2);
        ListNode editedList = solution.removeNthNodeFromEnd(head, 1);

        assertEquals(1, editedList.val);
    }
}