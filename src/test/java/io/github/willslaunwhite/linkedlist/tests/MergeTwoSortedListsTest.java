package io.github.willslaunwhite.linkedlist.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.willslaunwhite.linkedlist.ListNode;
import io.github.willslaunwhite.linkedlist.problems.MergeTwoSortedLists;

public class MergeTwoSortedListsTest {
    private MergeTwoSortedLists solution;
    private ListNode list1;
    private ListNode list2;

    @BeforeEach
    public void setUp() {
        solution = new MergeTwoSortedLists();
        ListNode node4 = new ListNode(4);
        ListNode node2 = new ListNode(2, node4);
        list1 = new ListNode(1, node2);

        ListNode list2node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, list2node4);
        list2 = new ListNode(1, node3);

    }

    @Test
    public void testMergeTwoSortedListsCaseOne() {
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        assertEquals(1, mergedList.val);
        assertEquals(1, mergedList.next.val);
        assertEquals(2, mergedList.next.next.val);
        assertEquals(3, mergedList.next.next.next.val);
        assertEquals(4, mergedList.next.next.next.next.val);
        assertEquals(4, mergedList.next.next.next.next.next.val);
    }

    @Test
    public void testMergeTwoSortedListsEmptyLists() {
        list1 = null;
        list2 = null;

        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        assertNull(mergedList);
    }

    @Test
    public void testMergeTwoSortedListsOneEmpty() {
        list1 = null;
        list2 = new ListNode(0);

        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        assertNotNull(mergedList);
        assertEquals(0, mergedList.val);
        assertNull(mergedList.next);
    }

    @Test
    public void testMergeTwoSortedListsCaseOneRecursive() {
        ListNode mergedList = solution.mergeTwoListsRecursive(list1, list2);

        assertEquals(1, mergedList.val);
        assertEquals(1, mergedList.next.val);
        assertEquals(2, mergedList.next.next.val);
        assertEquals(3, mergedList.next.next.next.val);
        assertEquals(4, mergedList.next.next.next.next.val);
        assertEquals(4, mergedList.next.next.next.next.next.val);
    }

    @Test
    public void testMergeTwoSortedListsEmptyListsRecursive() {
        list1 = null;
        list2 = null;

        ListNode mergedList = solution.mergeTwoListsRecursive(list1, list2);

        assertNull(mergedList);
    }

    @Test
    public void testMergeTwoSortedListsOneEmptyRecursive() {
        list1 = null;
        list2 = new ListNode(0);

        ListNode mergedList = solution.mergeTwoListsRecursive(list1, list2);

        assertNotNull(mergedList);
        assertEquals(0, mergedList.val);
        assertNull(mergedList.next);
    }
}
