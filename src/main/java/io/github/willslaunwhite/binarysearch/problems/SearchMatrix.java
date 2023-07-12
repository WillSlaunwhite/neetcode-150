package io.github.willslaunwhite.binarysearch.problems;

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0, j = matrix[0].length - 1; i < matrix.length && j >= 0;) {
            if (matrix[i][j] > target) {
                j--;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}