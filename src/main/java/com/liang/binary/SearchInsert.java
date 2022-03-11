package com.liang.binary;

/**
 * 35. 搜索插入位置
 * @see <a href="https://leetcode-cn.com/problems/search-insert-position/submissions/">LeetCode</a>
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (target == nums[m]) {
                return m;
            } else if (target > nums[m]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }
}
