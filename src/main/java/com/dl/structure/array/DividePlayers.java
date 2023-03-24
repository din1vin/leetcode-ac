package com.dl.structure.array;

import com.dl.tags.M_DoublePointer;
import com.dl.tags.Number;

import java.util.Arrays;

@Number(2491)
public class DividePlayers {

    @M_DoublePointer
    public long devicePlayers(int[] skill) {
        long res = 0L;
        Arrays.sort(skill);
        int r = skill[0] + skill[skill.length - 1];
        int i = 0, j = skill.length - 1;
        while (i < j) {
            if (skill[i] + skill[j] == r) {
                res += (long) skill[i++] * skill[j--];
            } else {
                return -1;
            }
        }
        return res;
    }
}
