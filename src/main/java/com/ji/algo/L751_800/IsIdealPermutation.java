package com.ji.algo.L751_800;/*
    user ji
    data 2019/6/2
    time 9:31 AM
*/

public class IsIdealPermutation {
    public static void main(String[] args) {

    }

    public boolean isIdealPermutation(int[] A) {
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1])
                count2++;
        }

        return count1 == count2;
    }

    public static boolean isRobotBounded(String instructions) {
        if (instructions == null || instructions.length() == 0)
            return true;
        if (!instructions.contains("L") && !instructions.contains("R"))
            return false;
        int left = 0;
        int right = 0;
        for (char a : instructions.toCharArray()
                ) {
            if (a == 'L')
                left++;
            if (a == 'R')
                right++;
        }
        return left != right;
    }
}
