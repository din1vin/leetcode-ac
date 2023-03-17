package com.dl.structure.array;

import com.dl.tags.Number;

/**
 * @author WuJi
 **/
@Number(283)
public class MoveZeros {
    public void moveZeros(int[] nums) {
        int idx = 0;
        for (int num : nums) {
            if (num != 0)
                nums[idx++] = num;
        }
        while (idx < nums.length) {
            nums[idx++] = 0;
        }
    }
}
