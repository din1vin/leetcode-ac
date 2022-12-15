package com.dl.structure.array;

/**
 * @author WuJi
 **/
public class NumSubarrayBoundedMax {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n = nums.length, ans = 0, i0 = -1, i1 = -1;
        for (int i = 0; i < n; ++i) {
            if (nums[i] > right) i0 = i;
            if (nums[i] >= left) i1 = i;
            ans += i1 - i0;
        }
        return ans;
    }
}
