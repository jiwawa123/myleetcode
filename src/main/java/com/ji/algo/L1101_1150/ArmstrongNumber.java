package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/9/3
    time 10:43 AM
*/

public class ArmstrongNumber {
    public static void main(String[] args) {

    }

    public boolean isArmstrongNumber(int tmp) {
        int count = 0;
        int t = (tmp + "").length();
        int next = tmp;
        while (next > 0) {
            count += Math.pow(next % 10, t);
            if (count > tmp)
                return false;
            next /= 10;
        }
        return count == tmp;
    }
}
