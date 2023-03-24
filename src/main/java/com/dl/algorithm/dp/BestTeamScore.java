package com.dl.algorithm.dp;

import com.dl.tags.Number;

import java.util.Arrays;

@Number(1626)
public class BestTeamScore {

    public int bestTeamScore(int[] scores, int[] ages) {
        Person[] p = new Person[scores.length];
        for (int i = 0; i < scores.length; i++) {
            p[i] = new Person(scores[i], ages[i]);
        }
        Arrays.sort(p, (p1, p2) -> p1.score != p2.score ? p1.score - p2.score : p2.age - p1.age);
        int[] dp = new int[scores.length];
        int res = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (p[j].age <= p[i].age) {
                    dp[i] = Math.max(dp[i], dp[j]);
                }
            }
            dp[i] += p[i].score;
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    class Person {
        int score;
        int age;

        public Person(int score, int age) {
            this.score = score;
            this.age = age;
        }
    }
}
