package com.ji.algo.L0_100;/*
    user ji
    data 2019/4/7
    time 10:47 PM
*/

public class ReverseInt {
    public static void main(String[] args) {

    }
    public int reverse(int x) {
        if (x == 0)
            return 0;
        int flag = 1;
        long t = x;
        if (x < 0) {
            flag = -1;
            t = -1 * t;
        }
        StringBuffer sp = new StringBuffer();
        while (t > 0) {
            sp.append(t % 10);
            t /= 10;
        }
        long tmp = flag * Long.parseLong(sp.toString());
        if (tmp > Integer.MAX_VALUE || tmp < Integer.MIN_VALUE)
            return 0;
        return (int) tmp;
    }

}
