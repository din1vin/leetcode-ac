package com.dl.algorithm.slidewindow;

import java.util.HashSet;
import java.util.Set;

/**
 * @author WuJi
 **/
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Set<Character> occ = new HashSet<>();
        int l = 0, r = 0;
        while (r < s.length()) {
            if (occ.contains(s.charAt(r))) {
                res = Math.max(r - l, res);
                occ.remove(s.charAt(l++));
            } else {
                occ.add(s.charAt(r++));
            }
        }
        res = Math.max(r - l, res);
        return res;
    }
}
