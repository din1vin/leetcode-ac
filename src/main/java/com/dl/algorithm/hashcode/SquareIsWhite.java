package com.dl.algorithm.hashcode;

import com.dl.tags.Number;

/**
 * @author WuJi
 **/
@Number(1812)
public class SquareIsWhite {
    public boolean squareIsWhite(String coordinates) {
        return coordinates.hashCode() % 2 == 1;
    }
}
