package com.dl.structure.heap;

import com.dl.tags.T_Heap;

import java.util.PriorityQueue;

/**
 * @author WuJi
 **/
public class FindKthLargest {
    @T_Heap
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int x : nums) {
            if (q.size() < k || q.peek() < x) q.add(x);
            if (q.size() > k) q.poll();
        }
        return q.peek();
    }


}
