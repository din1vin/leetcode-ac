package com.dl.structure.queue;

import com.dl.tags.Number;
import com.dl.tags.T_Queue;

import java.util.ArrayDeque;

/**
 * @author WuJi
 **/
@T_Queue
@Number(862)
public class ShortestSubarray {
    public int shortestSubarray(int[] nums, int k) {
        int l = nums.length, ans = l + 1;
        long[] ps = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            ps[i + 1] = ps[i] + nums[i];
        }
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < ps.length; i++) {
            long curS = ps[i];
            if (!q.isEmpty() && curS - ps[q.peekFirst()] >= k)
                ans = Math.min(ans, i - q.pollFirst());
            if (!q.isEmpty() && ps[q.peekLast()] >= curS)
                q.pollLast();
            q.addLast(i);
        }
        return ans > l ? -1 : ans;
    }
}
