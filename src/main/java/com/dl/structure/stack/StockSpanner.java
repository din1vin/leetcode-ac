package com.dl.structure.stack;

import com.dl.tags.Number;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WuJi
 **/
@Number(901)
@SuppressWarnings("unused")
public class StockSpanner {
    private final List<Integer> prices = new ArrayList<>();

    public int next(int price) {
        int r = 1;
        while (r <= prices.size() && prices.get(prices.size() - r) <= price) {
            r++;
        }
        prices.add(price);
        return r;
    }
}
