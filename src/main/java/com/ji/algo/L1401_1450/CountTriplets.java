package com.ji.algo.L1401_1450;

/**
 * user ji
 * data 2020/5/12
 * time 11:12 上午
 */
public class CountTriplets {
    public static void main(String[] args) {

    }

    public int countTriplets(int[] arr) {
        int len = arr.length;
        int ans = 0;
        for(int i = 0; i < len - 1; i ++){
            int sum = 0;
            for(int k = i; k < len ; k ++){
                sum ^= arr[k];
                if (sum == 0 && k > i) {
                    ans += (k - i);
                }
            }
        }
        return ans;
    }
}
