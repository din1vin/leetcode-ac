package com.dl.algorithm.binarysearch;

/**
 * 704. 二分查找
 * @see <a href="https://leetcode-cn.com/problems/binary-search/">LeetCode</a>
 */
@SuppressWarnings("unused")
public class BinarySearch {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
