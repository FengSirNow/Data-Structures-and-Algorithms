package com.baidu.algorithm.divide_and_conquer;

import java.util.Arrays;

/**
 * @author 冯纪元
 * @ClassName QuickSort
 * @description: TODO
 * @datetime 2026年 05月 06日 15:33
 * @version: 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,9,4,8,2,3,34,56,7,56};
//        sort(arr,0,arr.length-1);
        sortTwo(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }


    public static void sort(int[] arr,int start,int end){
        if (start>=end){
            return;
        }
        int middle = (start + end) / 2;
        int temp = arr[middle];
        int left = start;
        int right = end;
        while (left<right){
            while (arr[left]<temp){
                left++;
            }
            while (arr[right]>temp){
                right--;
            }
            if (left>=right){
                break;
            }
            arr[left] = arr[left]^arr[right];
            arr[right] = arr[left]^arr[right];
            arr[left] = arr[left]^arr[right];
            if (arr[left]==temp){
                left++;
            }
            if (arr[right]==temp){
                right--;
            }
        }
        if (left==right){
            left++;
            right--;
        }
        sort(arr,start,right);
        sort(arr,left,end);
    }

    public static void sortTwo(int[] arr,int start,int end){
        if (start >= end) {
            return;
        }
        int left = start;
        int right = end;
        int temp = arr[start];
        while (left < right) {
            while (left < right && arr[right] >= temp) {
                right--;
            }
            while (left < right && arr[left] <= temp) {
                left++;
            }
            if (left < right) {
                arr[left] = arr[left] ^ arr[right];
                arr[right] = arr[left] ^ arr[right];
                arr[left] = arr[left] ^ arr[right];
            }
        }
        arr[start] = arr[left];
        arr[left] = temp;
        sortTwo(arr, start, left - 1);
        sortTwo(arr, left + 1, end);
    }
}
