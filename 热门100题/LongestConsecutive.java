package com.springmvc.leedcode;

import java.util.Arrays;

/**
 * @author 侯伟业
 * @message 思想是去重和连续序列中的数字只能遍历一次
 * */

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        //0.判断数组的length
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        //1. 设置两个变量，用来确定最大连续序列的数量
        int maxlenghth =0;
        int currentlength=1;
        //2. 原数组进行排序(升序降序都可以)
        Arrays.sort(nums);
        //3.for循环遍历数组
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] -nums[i-1]==1)
            {
                currentlength++;
            } else if (nums[i] -nums[i-1]==0)
            {
                currentlength=currentlength;
            }
            else
            {
                currentlength=1;
            }
            maxlenghth=Math.max(maxlenghth,currentlength);
        }

        return maxlenghth;
    }
}
