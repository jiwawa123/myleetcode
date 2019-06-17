package com.ji.algo.L951_1000;/*
    user ji
    data 2019/6/17
    time 4:29 PM
*/

public class MaxWidthRamp {
    public static void main(String[] args) {

    }
    public int maxWidthRamp(int[] A) {
        int max = 0;
        for(int i = 0;i<A.length;i++){
            for(int j = A.length-1;j>i;j--){
                if(j-i<max)
                    break;
                if(A[j]>=A[i]){
                    max = Math.max(j-i,max);
                    break;
                }

            }
        }
        return max;
    }
    public int maxWidthRampII(int[] A) {
        // find max j - i to meet A[i] <= A[j]
        int max = 0;
        int cnt = 1;
        int len = A.length;
        int[] ramp = A;
        while (cnt <= len && (len - 1 - max - cnt) >= 0) {
            int right = len - 1 - max - cnt;
            int curIdx = len - cnt;
            boolean flag = false;
            for (int i = 0; i <= right; i++) {
                if (A[curIdx] - A[i] >= 0) {
                    ramp[curIdx] = curIdx - i;
                    flag = true;
                    break;
                }
            }
            ramp[curIdx] = flag ? ramp[curIdx] : 0;
            max = ramp[curIdx] > max ? ramp[curIdx] : max;
            cnt++;
        }
        return max;
    }
}
