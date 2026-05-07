package com.baidu.algorithm.dynamic_programming;

/**
 * @author 冯纪元
 * @ClassName ClimbStairs
 * @description: TODO
 * @datetime 2026年 05月 07日 10:20
 * @version: 1.0
 */
public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(dp2(10));
    }

    public static int dp(int n) {
        if (n <= 2) {
            return n;
        }
        return dp(n - 1) + dp(n - 2);
    }

    public static int dp2(int n) {
        int[] arry = new int[n + 1];
        if (n <= 2) {
            return n;
        }
        arry[1] = 1;
        arry[2] = 2;
        for (int i = 3; i <= n; i++) {
            arry[i] = arry[i - 1] + arry[i - 2];
        }
        return arry[n];
    }
}
