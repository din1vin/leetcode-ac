package com.dl.structure.array;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * <p>
 * 输入：nums = [-4,-1,0,3,10]
 * <p>
 * 输出：[0,1,9,16,100]
 * <p>
 * 解释：平方后，数组变为 [16,1,0,9,100] ,排序后，数组变为 [0,1,9,16,100]
 * <p>
 * 示例 2：
 * <p>
 * 输入：nums = [-7,-3,2,3,11]
 * <p>
 * 输出：[4,9,9,49,121]
 */
@SuppressWarnings("unused")
public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        int j = res.length - 1;
        int k = j;
        while (k >= 0) {
            int l = nums[i] * nums[i];
            int r = nums[j] * nums[j];
            if (l <= r) {
                res[k--] = r;
                j--;
            } else {
                res[k--] = l;
                j++;
            }
        }
        return res;
    }
}
