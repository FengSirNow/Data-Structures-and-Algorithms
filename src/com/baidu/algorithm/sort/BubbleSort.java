package com.baidu.algorithm.sort;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName BubbleSort
 * @description: TODO
 * @datetime 2026年 04月 21日 10:46
 * @version: 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arry = {5,4,3,2,1};
        boolean flag = false;
        for (int i = 0; i < arry.length-1; i++) {

            for (int j = 0; j < arry.length - i-1; j++) {
                if (arry[j+1]>arry[j]){
                    flag = true;
                    int i1 = arry[j+1] ^ arry[j];
                    arry[j]= i1^arry[j];
                    arry[j+1]= i1^arry[j+1];
                }

            }
            if (!flag){
                break;
            }else {
                flag = false;
            }

        }
        System.out.println(Arrays.toString(arry));
    }
}
