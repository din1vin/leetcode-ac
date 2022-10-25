package com.dl.structure.array;

import com.dl.tags.Number;
import com.dl.tags.T_Array;
import com.dl.tags.Tag;

import java.util.Arrays;

/**
 * @author WuJi
 **/
@T_Array
@Number(915)
public class PartitionDisjoint {
    public static int partitionDisjoint(int[] nums) {
        int l = nums.length;
        int[] lMax = new int[l];
        lMax[0] = nums[0];
        for (int i = 1; i < l; i++) {
            lMax[i] = Math.max(nums[i], lMax[i - 1]);
        }
        int[] rMin = new int[l];
        rMin[l - 1] = nums[l - 1];
        for (int j = l - 2; j >= 0; j--) {
            rMin[j] = Math.min(nums[j], rMin[j + 1]);
        }
        System.out.println(Arrays.toString(lMax));
        System.out.println(Arrays.toString(rMin));
        int r = 0;
        while (lMax[r] > rMin[r + 1]) {
            r++;
        }

        return r + 1;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{5, 0, 3, 8, 6};
        System.out.println(partitionDisjoint(nums));
    }
}
