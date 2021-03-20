package com.ji.algo.G0214;

/**
 * user ji
 * data 2021/2/14
 * time 9:45 下午
 */
public class G1 {
    public static void main(String[] args) {

    }

    public int minOperations(String s) {
        int len = s.length();
        int i = 0, tmp1 = 0, tmp2 = 0;
        while (i < len) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    tmp2++;
                } else {
                    tmp1++;
                }
            }else{
                if (s.charAt(i) == '0') {
                    tmp1++;
                } else {
                    tmp2++;
                }
            }
            i++;
        }
        return Math.min(tmp1, tmp2);
    }
}
