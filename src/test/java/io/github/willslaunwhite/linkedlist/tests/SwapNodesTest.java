package io.github.willslaunwhite.linkedlist.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.willslaunwhite.linkedlist.ListNode;
import io.github.willslaunwhite.linkedlist.problems.SwapNodes;

public class SwapNodesTest {
    private SwapNodes solution;
    private ListNode head;

    @BeforeEach
    public void setUp() {
        solution = new SwapNodes();
    }

    @Test
    public void testSwapNodesFirstCase() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        head = new ListNode(1, node2);

        ListNode swappedList = solution.swapNodes(head, 2);

        assertEquals(1, swappedList.val);
        assertEquals(4, swappedList.next.val);
        assertEquals(3, swappedList.next.next.val);
        assertEquals(2, swappedList.next.next.next.val);
        assertEquals(5, swappedList.next.next.next.next.val);
    }

    @Test
    public void testSwapNodesSecondCase() {
        ListNode node10 = new ListNode(5);
        ListNode node9 = new ListNode(9, node10);
        ListNode node8 = new ListNode(0, node9);
        ListNode node7 = new ListNode(3, node8);
        ListNode node6 = new ListNode(8, node7);
        ListNode node5 = new ListNode(7, node6);
        ListNode node4 = new ListNode(6, node5);
        ListNode node3 = new ListNode(6, node4);
        ListNode node2 = new ListNode(9, node3);
        head = new ListNode(7, node2);

        ListNode swappedList = solution.swapNodes(head, 5);

        assertEquals(7, swappedList.val);
        assertEquals(9, swappedList.next.val);
        assertEquals(6, swappedList.next.next.val);
        assertEquals(6, swappedList.next.next.next.val);
        assertEquals(8, swappedList.next.next.next.next.val);
        assertEquals(7, swappedList.next.next.next.next.next.val);
        assertEquals(3, swappedList.next.next.next.next.next.next.val);
        assertEquals(0, swappedList.next.next.next.next.next.next.next.val);
        assertEquals(9, swappedList.next.next.next.next.next.next.next.next.val);
        assertEquals(5, swappedList.next.next.next.next.next.next.next.next.next.val);
    }
}
