package com.ji.algo.G0712;

/**
 * user ji
 * data 2020/7/12
 * time 10:29 上午
 */
public class G2 {
    public static void main(String[] args) {
        System.out.println(numSub("0110111"));
    }

    public static int numSub(String s) {
        int max = (int) Math.pow(10, 9) + 7;
        long res = 0;
        long tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                tmp++;
            } else {
                res += (tmp + 1) % max * tmp % max / 2;
                res %= max;
                tmp = 0;
            }
        }
        res += (tmp + 1) * tmp / 2;
        res %= max;
        return (int) res % max;
    }
}
