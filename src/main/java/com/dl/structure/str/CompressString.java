package com.dl.structure.str;

import com.dl.tags.Number;

@Number(6)
public class CompressString {
    public String compressString(String S) {
        StringBuilder sb = new StringBuilder();
        char pre = ' ';
        int count = 0;
        for (char c : S.toCharArray()) {
            if (c != pre) {
                if (count > 0) {
                    sb.append(pre).append(count);
                }
                pre = c;
                count = 1;
            } else {
                count++;
            }
        }
        sb.append(pre).append(count);
        return sb.length() >= S.length() ? S : sb.toString();
    }
}
