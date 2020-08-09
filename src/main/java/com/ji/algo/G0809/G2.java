package com.ji.algo.G0809;

/**
 * user ji
 * data 2020/8/9
 * time 2:10 下午
 */
public class G2 {
    public static void main(String[] args) {
        System.out.println(findKthBit(4, 11));
    }

    public static char findKthBit(int n, int k) {
        if (n == 1) {
            return '0';
        }
        int t = 1;
        String tmp = "0";
        while (t < n) {
            tmp = create(tmp);
            t++;
        }
        return tmp.charAt(k - 1);
    }

    public static String create(String t) {
        StringBuilder sp = new StringBuilder(t + "1");
        for (int i = t.length() - 1; i >= 0; i--) {
            sp.append(t.charAt(i) == '0' ? '1' : '0');
        }
        return sp.toString();
    }
}
