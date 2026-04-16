package com.baidu.dataStructure.array;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName Two_Dimensional_Array
 * @description: 循环队列
 * @datetime 2026年 04月 15日 9:59
 * @version: 1.0
 */
public class Two_Dimensional_Array {
    public static void main(String[] args) {
        int[][] arry = new int[3][3];
        arry[0][1] = 1;
        arry[1][2] = 1;
        arry[2][0] = 1;
        arry[2][1] = 1;
        int[][] transfor = transfor(arry);
        System.out.println("------转换后------");
        for (int i = 0; i < transfor.length; i++) {
            System.out.println(Arrays.toString(transfor[i]));
            if (i==0){
                System.out.println("-----------");
            }
        }
        System.out.println("------恢复后------");
        int[][] recover = recover(transfor);
        for (int i = 0; i < recover.length; i++) {
            System.out.println(Arrays.toString(recover[i]));
        }
    }

    public static int[][] transfor(int[][] arry){
        if (arry.length==0){
            return null;
        }

        int amount = 0;
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                if (arry[i][j]!=0){
                    amount++;
                }
            }
        }
        int[][] tempArry = new int[amount+1][3];
        int temp = 1;
        tempArry[0][0] = arry.length;
        tempArry[0][1] = arry[0].length;
        tempArry[0][2] = amount;
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                if (arry[i][j]!=0){
                    tempArry[temp][0] = i;
                    tempArry[temp][1] = j;
                    tempArry[temp][2] = arry[i][j];
                    temp++;
                }
            }
        }
        return tempArry;
    }

    public static int[][] recover(int[][] arry){
        if (arry.length==0){
            return null;
        }
        int[][] tempArry = new int[arry[0][0]][arry[0][1]];
        for (int i = 1; i < arry.length; i++) {
            tempArry[arry[i][0]][arry[i][1]] = arry[i][2];
        }

        return tempArry;
    }

}
