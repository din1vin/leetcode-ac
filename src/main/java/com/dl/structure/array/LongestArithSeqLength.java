package com.dl.structure.array;

/**
 * 1027. 最长等差数列
 * @see <a href="https://leetcode-cn.com/problems/longest-arithmetic-subsequence/">leetcode</a>
 */
public class LongestArithSeqLength {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length, ans = 0;
        int[][] dp = new int[n][1001];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int d = nums[i] - nums[j] + 500;
                dp[i][d] = dp[j][d] + 1;
                ans = Math.max(ans, dp[i][d]);
            }
        }
        return ans + 1;
    }
}
