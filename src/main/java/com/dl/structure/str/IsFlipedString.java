package com.dl.structure.str;

import com.dl.tags.Number;

@Number(9)
public class IsFlipedString {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return (s1 + s1).contains(s2);
    }
}
