package com.dl.algorithm.binarysearch;

/**
 * 278. 第一个错误的版本
 * @see <a href="https://leetcode-cn.com/problems/first-bad-version/">Leetcode</a>
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int l = 1, r = n;
        while (l < r) {
            System.out.println("&&&&");
            int t = l + (r-l)/2;
            if(isBadVersion(t)){
                r = t;
            }else{
                l = t+1;
            }
        }
        return l;
    }

    private boolean isBadVersion(int t) {
        return t>=3;
    }

}
