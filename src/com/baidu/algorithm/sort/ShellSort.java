package com.baidu.algorithm.sort;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName ShellSort
 * @description: TODO
 * @datetime 2026年 04月 21日 15:55
 * @version: 1.0
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arry = {5,2,3,4,1};
        for (int i = 2; arry.length/i>=1; i*=2) {
            int gap = arry.length / i;
            for (int m=gap; m < arry.length;m++) {
                int temp = arry[m];
                int s = m;
                while (s>=gap&&temp<arry[s-gap]){
                    arry[s] = arry[s-gap];
                    s-=gap;
                }
                arry[s] = temp;
            }
        }
        System.out.println(Arrays.toString(arry));
    }

}
