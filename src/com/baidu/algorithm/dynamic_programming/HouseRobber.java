package com.baidu.algorithm.dynamic_programming;

/**
 * @author 冯纪元
 * @ClassName HouseRobber
 * @description: 偷房子问题
 * @datetime 2026年 05月 07日 10:38
 * @version: 1.0
 */
public class HouseRobber {
    public static int rober(int[] nums){
        int[] dp = new int[nums.length];
        if (nums==null||nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[dp.length-1];
    }
}
