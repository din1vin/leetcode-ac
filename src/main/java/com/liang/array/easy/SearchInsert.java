package com.liang.array.easy;

/**
 * 35. 搜索插入位置
 * <p>
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,3,5,6], target = 5
 * <p>
 * 输出: 2
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums = [1,3,5,6], target = 2
 * <p>
 * 输出: 1
 * <p>
 * 示例 3:
 * <p>
 * 输入: nums = [1,3,5,6], target = 7
 * <p>
 * 输出: 4
 * <p>
 * 示例 4:
 * <p>
 * 输入: nums = [1,3,5,6], target = 0
 * <p>
 * 输出: 0
 * <p>
 * 示例 5:
 * <p>
 * 输入: nums = [1], target = 0
 * <p>
 * 输出: 0
 * <p>
 *  
 * <p>
 * 提示:
 * <p>
 * 1 <= nums.length <= 104
 * <p>
 * -104 <= nums[i] <= 104
 * <p>
 * nums 为无重复元素的升序排列数组
 * <p>
 * -104 <= target <= 104
 */
@SuppressWarnings("unused")
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        if (nums.length < 1) return 0;
        int res = 0;
        while (res < nums.length && target > nums[res]) {
            res++;
        }
        return res;
    }

}
