package io.github.willslaunwhite.arrays.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.willslaunwhite.arrays.IsAnagram;

public class IsAnagramTest {
    private IsAnagram solution;

    @BeforeEach
    public void setUp() {
        solution = new IsAnagram();
    }

    @Test
    public void testcase1() {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(solution.isAnagram(s, t));
    }

    @Test
    public void testcase2() {
        String s = "car";
        String t = "rat";
        assertFalse(solution.isAnagram(s, t));
    }
}
