package com.dl.structure.array;

import com.dl.tags.Number;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
@Number(value = 219)
public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> memory = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (memory.containsKey(nums[i])) {
                if (i - memory.get(nums[i]) <= k) return true;
            }
            memory.put(nums[i], i);
        }
        return false;
    }
}
