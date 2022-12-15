package com.dl.structure.array;

import com.dl.tags.Number;
import com.dl.tags.T_Array;

/**
 * @author WuJi
 **/
@T_Array
@SuppressWarnings("unused")
public class ArraySolution {
    @Number(1822)
    public int arraySign(int[] nums) {
        int res = 1;
        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) res = -res;
        }
        return res;
    }


    @Number(1920)
    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }
        return res;
    }

}
