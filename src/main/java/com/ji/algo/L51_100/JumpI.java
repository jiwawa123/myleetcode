package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 11:03 AM
*/

public class JumpI {
    public static void main(String[] args) {

    }

    public boolean canJump(int[] nums) {
        int right = nums.length-1;
        int i = right;
        while(i >= 0) {
            if(nums[i] >= right-i) {    //如果当前下标可以跳转到right，就更新right的值
                right = i;
            }
            i--;
        }
        if(right != 0) return false;    //当整个循环结束时，right没有到达0,说明不可抵达
        return true;
    }
}
