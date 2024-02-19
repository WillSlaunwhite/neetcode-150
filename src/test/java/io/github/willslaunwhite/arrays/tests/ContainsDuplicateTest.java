package io.github.willslaunwhite.arrays.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.willslaunwhite.arrays.ContainsDuplicate;

public class ContainsDuplicateTest {
    private ContainsDuplicate solution;

    @BeforeEach
    public void setUp() {
        solution = new ContainsDuplicate();
    }

    @Test
    public void testcase1() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    public void testcase2() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(solution.containsDuplicate(nums));
    }

    @Test
    public void testcase3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(solution.containsDuplicate(nums));
    }
}
