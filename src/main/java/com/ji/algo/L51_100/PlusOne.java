package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 4:43 PM
*/

public class PlusOne {
    public static void main(String[] args) {
        int arr[] = {8,9,9,9,9};
        plusOne(arr);
    }

    public static int[] plusOne(int[] digits) {
        int next = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int tmp = (digits[i] + next + 1) / 10;
            if (i == digits.length - 1)
                digits[i] = (digits[i] + next + 1) % 10;
            else
                digits[i] = (digits[i] + next) % 10;
            next = tmp;
        }
        if (next == 0)
            return digits;
        else {
            int answer[] = new int[digits.length + 1];
            answer[0] = next;
            for (int i = 1; i < answer.length; i++) {
                answer[i] = digits[i - 1];
            }
            return answer;
        }
    }
}
