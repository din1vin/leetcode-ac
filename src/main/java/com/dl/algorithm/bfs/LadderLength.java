package com.dl.algorithm.bfs;

import com.dl.tags.Number;

import java.util.*;

/**
 * @author WuJi
 **/
@Number(127)
public class LadderLength {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> remain = new HashSet<>(wordList);
        int res = 0;
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        while (queue.size() > 0) {
            int s = queue.size();
            res++;
            for (int i = 0; i < s; i++) {
                String cur = queue.poll();
                Iterator<String> iterator = remain.iterator();
                while (iterator.hasNext()) {
                    String next = iterator.next();
                    if (isReachable(cur, next)) {
                        if (next.equals(endWord)) return res + 1;
                        iterator.remove();
                        if (remain.isEmpty()) return 0;
                        queue.offer(next);
                    }
                }
            }
        }
        return 0;
    }

    private boolean isReachable(String s1, String s2) {
        boolean f = false;
        int l = s1.length();
        for (int i = 0; i < l; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (f) return false;
                f = true;
            }
        }
        return true;
    }
}
