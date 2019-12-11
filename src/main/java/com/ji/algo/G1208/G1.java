package com.ji.algo.G1208;/*
    user ji
    data 2019/12/8
    time 10:40 AM
*/

public class G1 {
    public static void main(String[] args) {

    }

    public int subtractProductAndSum(int n) {
        n = Math.abs(n);
        long a = 1;
        int t = 0;
        while (n > 0) {
            a *= n % 10;
            t += n % 10;
            n /= 10;
        }
        return (int)(a - t);
    }
}
