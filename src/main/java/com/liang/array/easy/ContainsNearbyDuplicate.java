package com.liang.array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 219. 存在重复元素II
 * <p>
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,1], k = 3
 * <p>
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums = [1,0,1,1], k = 1
 * <p>
 * 输出: true
 * <p>
 * 示例 3:
 * <p>
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * <p>
 * 输出: false
 */
@SuppressWarnings("unused")
public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> memory = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (memory.containsKey(nums[i])) {
                if (i - memory.get(nums[i]) <= k) return true;
            }
            memory.put(nums[i], i);
        }
        return false;
    }
}
