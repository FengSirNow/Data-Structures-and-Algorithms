package com.baidu.algorithm.find;

/**
 * @author 冯纪元
 * @ClassName BinarySearch
 * @description: TODO
 * @datetime 2026年 05月 06日 14:37
 * @version: 1.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arry = {1,2,3,4,5};
        int recursion = recursion(arry, 5, 0, 4);
        System.out.println(recursion);
    }
    public static int recursion(int[] arry,int temp,int start,int end){
        if (start>end){
            return -1;
        }
        int middle = (start + end) / 2;
        int i = arry[middle];
        int source = -1;
        if (temp<i){
            return recursion(arry,temp,start,middle-1);
        }else if (temp>i){
            return   recursion(arry,temp,middle+1,end);
        }else {
            return middle;
        }
    }

}
