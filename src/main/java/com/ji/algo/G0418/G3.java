package com.ji.algo.G0418;

/**
 * user ji
 * data 2021/4/18
 * time 4:19 下午
 */
public class G3 {
    public static void main(String[] args) {

    }

    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int len = nums.length;
        int [] ans = new int[len];
        for (int i = 0; i < len; i++) {
            //前缀异或
            if(i>0) nums[i] ^= nums[i - 1];
            //倒序插入
            ans[len-i-1]= nums[i]^(int)(Math.pow(2,maximumBit)-1);
        }
        return ans;
    }
}
