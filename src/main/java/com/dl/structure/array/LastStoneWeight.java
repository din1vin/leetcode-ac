package com.dl.structure.array;

import com.dl.tags.M_InsertSort;
import com.dl.tags.Number;
import com.dl.tags.T_Array;
import com.dl.tags.T_Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author WuJi
 **/
@T_Array
@Number(1046)
public class LastStoneWeight {
    /**
     * 插入排序解法
     */
    @M_InsertSort
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) return stones[0];
        if (stones.length == 2) return Math.abs(stones[1] - stones[0]);
        Arrays.sort(stones);
        for (int j = stones.length - 1; j > 1; j--) {
            int r = j - 1;
            stones[r] = Math.abs(stones[j] - stones[r]);
            for (int s = r; s > 0 && stones[s] < stones[s - 1]; s--) {
                int tmp = stones[s];
                stones[s] = stones[s - 1];
                stones[s - 1] = tmp;
            }
        }
        return Math.abs(stones[1] - stones[0]);
    }

    /**
     * 大顶堆
     */
    @T_Heap
    public int lastStoneWeight2(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }
        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if (a > b)
                pq.offer(a - b);
        }
        return pq.size() > 0 ? pq.poll() : 0;
    }
}