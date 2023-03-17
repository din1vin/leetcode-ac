package com.dl.algorithm.greedy;

import com.dl.tags.Number;

@Number(1605)
public class RestoreMatrix {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] res = new int[rowSum.length][colSum.length];
        int i = 0, j = 0;
        while (i < rowSum.length && j < colSum.length) {
            int v = Math.min(rowSum[i], colSum[j]);
            res[i][j] = v;
            rowSum[i] -= v;
            colSum[j] -= v;
            if (rowSum[i] == 0) {
                i++;
            }
            if (colSum[j] == 0) {
                j++;
            }
        }
        return res;
    }
}
