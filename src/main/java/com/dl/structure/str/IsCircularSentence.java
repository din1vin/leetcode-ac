package com.dl.structure.str;

import com.dl.tags.Number;

@Number(2490)
public class IsCircularSentence {
    public boolean isCircularSentence(String sentence) {
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) return false;
        char pre = sentence.charAt(0);
        char lastEnd = pre;
        for (char s : sentence.toCharArray()) {
            if (pre == ' ' && s != lastEnd) return false;
            if (s == ' ' && pre != ' ') lastEnd = pre;
            pre = s;
        }
        return true;
    }
}
