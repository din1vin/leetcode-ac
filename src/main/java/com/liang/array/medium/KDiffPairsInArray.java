package com.liang.array.medium;

import java.util.TreeMap;

/**
 * 532. 数组中的 k-diff 数对
 *
 * @see <a href="https://leetcode.cn/problems/k-diff-pairs-in-an-array/"></a>
 **/
public class KDiffPairsInArray {
    public static void main(String[] args) {
        KDiffPairsInArray kDiffPairsInArray = new KDiffPairsInArray();
        int[] nums = new int[]{1, 3, 1, 5, 4};
        System.out.println(kDiffPairsInArray.findPairs(nums, 0));
    }

    public int findPairs(int[] nums, int k) {
        int count = 0;
        TreeMap<Integer, Integer> numsCnt = new TreeMap<>();
        for (int num : nums) {
            Integer currentCnt = numsCnt.getOrDefault(num, 0);
            numsCnt.put(num, currentCnt + 1);
        }
        if (k == 0) {
            return (int) numsCnt.entrySet().stream().filter(x -> x.getValue() > 1).count();
        }
        int[] sortedArr = numsCnt.keySet().stream().mapToInt(Integer::intValue).toArray();
        int i = 0;
        while (i < sortedArr.length - 1) {
            for (int j = i + 1; j < sortedArr.length && sortedArr[j] - sortedArr[i] <= k; j++) {
                if (sortedArr[j] - sortedArr[i] == k) {
                    count++;
                }
            }
            i++;
        }
        return count;
    }
}
