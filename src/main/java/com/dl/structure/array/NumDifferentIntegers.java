package com.dl.structure.array;

import java.util.Arrays;

/**
 * @author WuJi
 **/
public class NumDifferentIntegers {
    public static void main(String[] args) {
        System.out.println(new NumDifferentIntegers().numDifferentIntegers("a123bc34d8ef34"));
    }

    public int numDifferentIntegers(String word) {
        return (int) Arrays
            .stream(word.split("[a-z]+"))
            .peek(System.out::println)
            .filter(x -> !"".equals(x))
            .map(this::reduceZeros)
            .distinct()
            .count();
    }

    private String reduceZeros(String s) {
        int i = 0;
        while (s.charAt(i) == '0' && i < s.length() - 1) i++;
        return s.substring(i);
    }
}
