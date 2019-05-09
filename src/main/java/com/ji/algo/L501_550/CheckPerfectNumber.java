package com.ji.algo.L501_550;/*
    user ji
    data 2019/5/9
    time 5:19 PM
*/

public class CheckPerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(6));
    }

    public static boolean checkPerfectNumber(int num) {
        int count = 1;
        if (num == 1)
            return false;
        int i = 2, j = num;
        while (i < j) {
            if (num % i == 0) {
                j = num / i;
                count += i;
                count += j;
            }
            i++;
        }
        return count == num;
    }
}
