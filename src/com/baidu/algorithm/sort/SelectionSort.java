package com.baidu.algorithm.sort;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName SelectionSort
 * @description: TODO
 * @datetime 2026年 04月 21日 14:31
 * @version: 1.0
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arry = {3,4,1,2,5};
        for (int i = 0; i < arry.length; i++) {
            int min = arry[i];
            int k = i;
            for (int i1 = i+1; i1 < arry.length; i1++) {
                if (arry[i1]<min){
                    min = arry[i1];
                    k = i1;
                }
            }
            if (k!=i){
              arry[i] =  arry[i]^arry[k];
              arry[k] = arry[i] ^ arry[k];
              arry[i] = arry[i]^arry[k];
            }
        }
        System.out.println(Arrays.toString(arry));
    }
}
