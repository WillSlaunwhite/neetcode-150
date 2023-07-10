package io.github.willslaunwhite.linkedlist.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.willslaunwhite.linkedlist.ListNode;
import io.github.willslaunwhite.linkedlist.problems.ReorderList;

/*
 * need to refactor tests so there's no return expected
 */

public class ReorderListTest {
    private ReorderList solution;
    private ListNode head;

    @BeforeEach
    public void setUp() {
        solution = new ReorderList();
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        head = new ListNode(1, node2);
    }

    @Test
    public void testReorderListFirstCase() {
        ListNode reorderedList = solution.reorderList(head);

        assertEquals(1, reorderedList.val);
        assertEquals(4, reorderedList.next.val);
        assertEquals(2, reorderedList.next.next.val);
        assertEquals(3, reorderedList.next.next.next.val);
    }

    @Test
    public void testReorderListNull() {
        head = null;

        ListNode reorderedList = solution.reorderList(head);

        assertNull(reorderedList);
    }

    @Test
    public void testReorderListZeroHead() {
        head = new ListNode(0);

        ListNode reorderedList = solution.reorderList(head);

        assertNotNull(reorderedList);
        assertEquals(0, reorderedList.val);
        assertNull(reorderedList.next);
    }
}