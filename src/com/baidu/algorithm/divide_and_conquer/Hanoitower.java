package com.baidu.algorithm.divide_and_conquer;

/**
 * @author 冯纪元
 * @ClassName Hanoitower
 * @description: TODO
 * @datetime 2026年 05月 06日 15:24
 * @version: 1.0
 */
public class Hanoitower {
    public static void main(String[] args) {
        remove("A","B","C",10);
    }

    public static void remove(String A,String B,String C,int n){
        if (n==1){
            System.out.println("从"+A+"移到"+C);
            return;
        }
        remove(A,C,B,n-1);
        remove(A,B,C,1);
        remove(B,A,C,n-1);
    }
}
