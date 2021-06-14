package com.ji.algo.G0502;

/**
 * user ji
 * data 2021/5/15
 * time 11:11 下午
 */
public class G4 {
    public static void main(String[] args) {

    }

    public int maxDistance(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int L = 0;
        int R = 0;
        while (L < len1 && R < len2) {
            if (nums1[L] > nums2[R]) {
                L++;
            }
            R++;
        }
        return R - L - 1 >= 0 ? R - L - 1 : 0;
    }
}
