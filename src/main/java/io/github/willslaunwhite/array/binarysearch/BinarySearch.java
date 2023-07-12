package io.github.willslaunwhite.array.binarysearch;

public class BinarySearch {
   public int binarySearch(int[] nums, int target) {
      for (int left = 0, right = nums.length - 1; left <= right;) {
         int middle = (left + right) / 2;
         if (nums[middle] < target) {
            left = middle + 1;
         } else if (nums[middle] > target) {
            right = middle - 1;
         } else {
            return middle;
         }
      }

      return -1;
   }
}
