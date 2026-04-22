package com.baidu.algorithm.sort;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName QuickSort
 * @description: TODO
 * @datetime 2026年 04月 21日 16:53
 * @version: 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arry = {2, 10, 8, 22, 34, 5, 12, 28};
        sort(arry, 0, arry.length - 1);
        System.out.println(Arrays.toString(arry));
    }

    public static void sort(int[] arry, int left, int right) {
        int middle = (left + right) / 2;
        int mark = arry[middle];
        int tmpLeft = left;
        int tmpRight = right;
        while (tmpLeft < tmpRight) {
            while (arry[tmpLeft] < mark) {
                tmpLeft++;
            }
            while (arry[tmpRight] > mark) {
                tmpRight--;
            }
            if (tmpLeft >= tmpRight) {
                break;

            }
            arry[tmpLeft] = arry[tmpLeft] ^ arry[tmpRight];
            arry[tmpRight] = arry[tmpLeft] ^ arry[tmpRight];
            arry[tmpLeft] = arry[tmpLeft] ^ arry[tmpRight];

            if (arry[tmpLeft]==mark){
                tmpRight--;
            }
            if (arry[tmpRight]==mark){
                tmpLeft++;
            }

        }
        if (tmpLeft==tmpRight){
            tmpLeft++;
            tmpRight--;
        }
        if (tmpRight > left) sort(arry, left, tmpRight);
        if (tmpLeft < right) sort(arry, tmpLeft, right);
    }


}
