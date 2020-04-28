package com.ji.algo.game.G0419;

/**
 * user ji
 * data 2020/4/19
 * time 10:18 AM
 */
public class G1 {
    public static void main(String[] args) {
        System.out.println(reformat("covid2019"));
    }

    public static String reformat(String s) {
        StringBuilder sp = new StringBuilder();
        StringBuilder sp1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sp.append(s.charAt(i));
            } else {
                sp1.append(s.charAt(i));
            }
        }
        int last = sp.length() - sp1.length();
        if (last <= -2 || last >= 2)
            return "";
        int i = sp.length() - 1, j = sp1.length() - 1;
        StringBuilder res = new StringBuilder();
        boolean flag = true;
        while (i >= 0 || j >= 0) {
            if (i > j) {
                res.append(sp.charAt(i--));
                flag = false;
                continue;
            }
            if (i < j) {
                res.append(sp1.charAt(j--));
                flag = true;
                continue;
            }

            if (flag) {
                res.append(sp.charAt(i--));
                flag = false;
            } else {
                res.append(sp1.charAt(j--));
                flag = true;
            }
        }
        return res.toString();
    }
}
