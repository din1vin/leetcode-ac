package com.dl.structure.array;

import com.dl.tags.Number;
import com.dl.tags.T_Array;

/**
 * @author WuJi
 **/
@T_Array
@Number(807)
public class MaxIncreaseKeepingSkyline {
    public static void main(String[] args) {
        int[][] grid = {
            {3, 0, 8, 4},
            {2, 4, 5, 7},
            {9, 2, 6, 3},
            {0, 3, 1, 0}
        };
        int[] m = {2, 4, 5, 7};
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] x = new int[n];
        int[] y = new int[n];
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < n; j++) {
                x[i] = Math.max(x[i], grid[i][j]);
                y[j] = Math.max(y[j], grid[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res += Math.min(x[i], y[j]) - grid[i][j];
            }
        }
        return res;
    }
}
