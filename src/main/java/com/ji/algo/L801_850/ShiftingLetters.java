package com.ji.algo.L801_850;/*
    user ji
    data 2019/6/20
    time 10:04 AM
*/

public class ShiftingLetters {
    public static void main(String[] args) {
        int arr[] = {26, 9, 17};
        System.out.println(shiftingLetters("ruu", arr));
    }

    public static String shiftingLetters(String S, int[] shifts) {
        long arr[] = new long[shifts.length];
        arr[arr.length - 1] = shifts[shifts.length - 1];
        for (int i = shifts.length - 2; i >= 0; i--) {
            arr[i] = shifts[i] + arr[i + 1];
        }
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < S.length() && i < shifts.length; i++) {
            int tmp = S.charAt(i) + (int) (arr[i] % 26);
            if (tmp > 122)
                tmp -= 26;
            sp.append((char) tmp);
        }
        return sp.toString();
    }
}
