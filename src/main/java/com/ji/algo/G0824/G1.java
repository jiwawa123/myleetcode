package com.ji.algo.G0824;

/**
 * user ji
 * data 2020/8/24
 * time 9:09 上午
 */
public class G1 {
    public static void main(String[] args) {
        System.out.println(thousandSeparator(1111234));
    }

    public static String thousandSeparator(int n) {
        if(n==0)
            return "0";
        int len = 0;
        StringBuilder sp = new StringBuilder();
        while (n > 0) {
            if (len == 3) {
                sp.append(".");
                len = 0;
            }
            len++;
            sp.append(n % 10);
            n /= 10;
        }
        return sp.reverse().toString();
    }
}
