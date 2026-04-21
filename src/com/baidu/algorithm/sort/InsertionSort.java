package com.baidu.algorithm.sort;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName InsertionSort
 * @description: TODO
 * @datetime 2026年 04月 21日 15:27
 * @version: 1.0
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arry = {5, 2, 3, 4, 1};
        for (int i = 1; i < arry.length; i++) {
            int temp = arry[i];
            int j = i;
            while (j > 0 && temp < arry[j - 1]) {
                arry[j] = arry[j - 1];
                j--;
            }
            arry[j] = temp;
        }
        System.out.println(Arrays.toString(arry));
    }
}
