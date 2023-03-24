package com.dl.algorithm.dfs;

import com.dl.tags.Number;

import java.util.ArrayList;
import java.util.List;

@Number(79)
public class SubSets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int n : nums) {
            int s = result.size();
            for (int i = 0; i < s; i++) {
                List<Integer> ele = result.get(i);
                ArrayList<Integer> newEle = new ArrayList<>(ele);
                newEle.add(n);
                result.add(newEle);
            }
        }
        return result;
    }
}
