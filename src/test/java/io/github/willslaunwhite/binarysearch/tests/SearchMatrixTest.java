package io.github.willslaunwhite.binarysearch.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.willslaunwhite.binarysearch.problems.SearchMatrix;

public class SearchMatrixTest {
    private SearchMatrix solution;

    @BeforeEach
    public void setUp() {
        this.solution = new SearchMatrix();
    }

    @Test
    public void testSearchMatrixFirstCase() {
        int[][] matrix = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        assertTrue(this.solution.searchMatrix(matrix, 3));
    }

    @Test
    public void testSearchMatrixSecondCase() {
        int[][] matrix = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        assertFalse(this.solution.searchMatrix(matrix, 13));
    }
}
