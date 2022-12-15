package com.dl.structure.str;

import com.dl.tags.Number;

import java.util.Arrays;

/**
 * @author WuJi
 **/
@Number(1945)
public class GetLucky {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(String.valueOf(c - 'a' + 1));
        }
        String ints = sb.toString();
        for (int i = 0; i < k; i++) {
            ints = String.valueOf(sum(ints));
        }
        return Integer.parseInt(ints);
    }

    private int sum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += (c - '0');
        }
        return sum;
    }
}
