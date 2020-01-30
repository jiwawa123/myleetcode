package com.ji.algo.L1301_1350;/*
    user ji
    data 2020/1/30
    time 10:34 AM
*/

import java.util.ArrayList;
import java.util.List;

public class PrintVertically {
    public static void main(String[] args) {

    }

    public List<String> printVertically(String s) {
        String tmp[] = s.split(" ");
        int max = 0;
        for (int i = 0; i < tmp.length; i++) {
            max = Math.max(tmp[i].length(), max);
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            StringBuilder sp = new StringBuilder();
            for (int j = 0; j < tmp.length; j++) {
                if (tmp[j].length() > i + 1) {
                    sp.append(tmp[j].charAt(i));
                } else {
                    sp.append(" ");
                }
            }
            int t = sp.length() - 1;
            while (t >= 0) {
                if (sp.charAt(t--) != ' ') {
                    break;
                }
            }
            res.add(sp.substring(0, t + 1).toString());
        }
        return res;
    }

}
