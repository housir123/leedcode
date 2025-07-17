package com.springmvc.leedcode;

/**
 * @author 侯伟业
 * @message 该面积=x*y，主要在于考虑如何移动哪个指针，x是在不断减小的，如果移动大的y,那么分为两种情况：
 * 1） y变大，y1>y,那么根据短板原则，公式中的y保持不变，那么面积整体变小，不符合
 * 2） y变小,但y1>y,那么根据短板原则，公式中的y保持不变，那么面积整体变小，不符合
 *    y变小，y1<y，那么根据短板原则，公式中的y变小了，那么面积也整体变小了，不符合
 *  由此说明不可以移动大的数所对应的指针
 *  那么我们移动小的指针，分为两种情况
 *  1）y变大，新得到的y1比另一个指针所对应的数更大，那么公式里的y则变成了另一个指针所对应的数，
 *  由于另一个指针所对应的数本来就比现在这个指针之前对应的数字大，所以公式里的y变大了，有可能面积会变大，也有可能变小
 *  y变大，新得到的y1虽然没有另一个指针所对应的数大，但公式里的y变大了，有可能面积会变大，也有可能变小
 *  2）y变小，新得到的y1比这个指针之前对应的数字更小，所以面积变小，不符合
 */
public class MaxArea
{
    public int maxArea(int[] height)
    {
        int left = 0;
        int right= height.length-1;
        int y = 0;
        int currentsize=0;
        int maxsize=0;
        while(left<right){
            if(height[left]<height[right]){
                currentsize=(right-left)*height[left];
                left++;
            }
            else{
                currentsize=(right-left)*height[right];
                right--;
            }
            maxsize=Math.max(maxsize,currentsize);
        }
        return maxsize;
    }

}
