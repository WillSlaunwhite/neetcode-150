package io.github.willslaunwhite.binarysearch.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.willslaunwhite.binarysearch.problems.BinarySearch;

public class BinarySearchTest {
    private int[] input;
    private int target;
    private BinarySearch solution;

    @BeforeEach
    public void setUp() {
        input = new int[] { -1, 0, 3, 5, 9, 12 };
        solution = new BinarySearch();
    }

    @Test
    public void testBinarySearchFirstCase() {
        target = 9;
        assertEquals(4, solution.binarySearch(input, target));
    }

    @Test
    public void testBinarySearchSecondCase() {
        target = -2;
        assertEquals(-1, solution.binarySearch(input, target));
    }
}
