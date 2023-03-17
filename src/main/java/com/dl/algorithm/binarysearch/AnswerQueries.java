package com.dl.algorithm.binarysearch;

import com.dl.tags.Number;

import java.util.Arrays;

@Number(2389)
public class AnswerQueries {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            res[i] = findLeft(nums, queries[i]);
        }
        return res;
    }

    public int findLeft(int[] nums, int x) {
        int r = nums.length - 1, l = 0;
        while (l <= r) {
            int mid = (l + r) >> 1;
            if (nums[mid] > x)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }
}
