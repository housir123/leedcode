package com.springmvc.leedcode;
/**
 * @author 侯伟业
 * @message 利用两个标记索引，一个用来遍历数组，一个用来标记数组元素为零的位置，类似于冒泡排序
 */
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            //用来标记0的位置
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }
    //交换位置，交换0和非0的位置
    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}

