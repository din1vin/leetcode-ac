package com.dl.structure.array;

import com.dl.tags.Number;

import java.util.Arrays;

@Number(1051)
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int result = 0;
        int[] clone = heights.clone();
        Arrays.sort(clone);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != clone[i]) result++;
        }
        return result;
    }
}
