package com.baidu.algorithm.ksm;

/**
 * @author 冯纪元
 * @ClassName KSM
 * @description: ksm算法匹配
 * @datetime 2026年 05月 07日 17:38
 * @version: 1.0
 */
public class KSM {
    public static void main(String[] args) {
        String str1 = "BBC ABCDAB ABCDABCDABDE";
        String str2 = "ABCDABD";
        System.out.println(ksm(str1,str2));
    }
    public static int ksm(String text,String pattern){
        int[] next = next(pattern);
        char[] charArray = text.toCharArray();
        char[] charArray1 = pattern.toCharArray();
        for (int i = 0,j=0; i < charArray.length; i++) {
            while (j>0&&charArray[i]!=charArray1[j]){
                j = next[j-1];
            }
            if (charArray[i]==charArray1[j]){
                j++;
            }
            if (j==pattern.length()){
                return i-j+1;
            }
        }
        return -1;
    }
    public static int[] next(String str){
        char[] charArray = str.toCharArray();
        int[] next = new int[str.length()];
        next[0] = 0;
        for (int i = 1,j=0; i < str.length(); i++) {
            while (j>0&&charArray[i]!=charArray[j]){
                j--;
            }
            if (charArray[i]==charArray[j]){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
