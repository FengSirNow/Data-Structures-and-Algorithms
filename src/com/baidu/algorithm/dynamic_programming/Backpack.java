package com.baidu.algorithm.dynamic_programming;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName Backpack
 * @description: 背包问题
 * @datetime 2026年 05月 07日 11:09
 * @version: 1.0
 */
public class Backpack {
    public static void put(int n){
        int[] w={1,4,3};
        int[] val={1500,3000,2000};
        int[][] arry = new int[4][n+1];
        int[][] brry = new int[4][n+1];
        Arrays.fill(arry[0], 0);
        for (int i = 0; i < 4; i++) {
            arry[i][0] = 0;
        }
        arry[1][1] = 1500;
        for (int i = 1; i <arry.length; i++) {
            for (int j = 1; j <arry[0].length; j++) {
                    if(w[i-1]>j){
                        arry[i][j] = arry[i-1][j];
                    }else {
                        arry[i][j] =Math.max(arry[i-1][j],val[i-1]+arry[i-1][j-w[i-1]]) ;
                    }
            }
        }
    }
}
