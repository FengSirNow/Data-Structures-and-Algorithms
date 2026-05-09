package com.baidu.algorithm.ksm;

/**
 * @author 冯纪元
 * @ClassName bruteForceMatch
 * @description: 暴力匹配
 * @datetime 2026年 05月 07日 15:26
 * @version: 1.0
 */
public class bruteForceMatch {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "h";
        System.out.println(force(s1,s2));
    }
    public static int force(String str1,String str2){
        char[] charArray = str1.toCharArray();
        char[] charArray1 = str2.toCharArray();
        int temp = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i]==charArray1[temp]){
                temp++;
            }else {
                temp = 0;
            }
            if (temp==str2.length()){
                return  i-temp+1;
            }
        }
        return -1;
    }
}
