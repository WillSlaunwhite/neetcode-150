package io.github.willslaunwhite.linkedlist.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.willslaunwhite.linkedlist.ListNode;
import io.github.willslaunwhite.linkedlist.problems.AddTwoNumbers;

public class AddTwoNumbersTest {
    private AddTwoNumbers solution;
    private ListNode l1;
    private ListNode l2;

    @BeforeEach
    public void setUp() {
        solution = new AddTwoNumbers();
    }

    @Test
    public void addTwoNumbersTest() {
        ListNode l1n3 = new ListNode(3);
        ListNode l1n2 = new ListNode(4, l1n3);
        l1 = new ListNode(2, l1n2);

        ListNode l2n3 = new ListNode(4);
        ListNode l2n2 = new ListNode(6, l2n3);
        l2 = new ListNode(5, l2n2);

        ListNode addedNode = solution.addTwoNumbers(l1, l2);
        assertEquals(7, addedNode.val);
        assertEquals(0, addedNode.next.val);
        assertEquals(8, addedNode.next.next.val);
    }

    @Test
    public void testAddTwoNumbersZeroLists() {
        l1 = new ListNode(0);
        l2 = new ListNode(0);

        ListNode addedNode = solution.addTwoNumbers(l1, l2);
        assertEquals(0, addedNode.val);
    }

}
