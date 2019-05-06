package com.ji.algo.L701_750;/*
    user ji
    data 2019/5/6
    time 10:46 PM
*/

public class IsOneBitCharacter {
    public static void main(String[] args) {

    }

    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length < 2)
            return true;
        int i = 0;
        while (i < bits.length) {
            if (i == bits.length - 1)
                return true;
            if (bits[i] == 1)
                i += 2;
            else
                i++;
        }
        return false;
    }
}
