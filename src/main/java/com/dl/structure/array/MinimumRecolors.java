package com.dl.structure.array;

import com.dl.tags.Number;

@Number(2379)
//sliding window
public class MinimumRecolors {
    public int minimumRecolors(String blocks, int k) {
        int r = Integer.MAX_VALUE;
        for (int i = 0, j = k; j < blocks.length(); i++, k++) {
            r = Math.min(r, whiteCount(blocks.substring(i, j)));
        }
        return r;
    }

    private int whiteCount(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                res++;
            }
        }
        return res;
    }
}
