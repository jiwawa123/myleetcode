package com.ji.algo.tx;

import java.util.*;

/**
 * user ji
 * data 2020/8/23
 * time 7:58 下午
 */
public class G2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.next();
        int n = sc.nextInt();
        List<String> list = new LinkedList<>();
        for (int i = 0; i < tmp.length(); i++) {
            String s = "" + tmp.charAt(i);
            ajust(list, s, n);
            for (int j = i + 1; j < tmp.length(); j++) {
                s += tmp.charAt(j);
                ajust(list, s, n);
            }
        }
        System.out.println(list.get(n - 1));
    }

    public static void ajust(List<String> tmp, String t, int k) {
        if (tmp.size() < k) {
            tmp.add(t);
            return;
        }
        for (int i = 0; i < tmp.size(); i++) {
            int res = isMatch(t, tmp.get(i));
            if (res == 0)
                return;
            if (res == -1) {
                tmp.add(i, t);
                tmp.remove(tmp.size() - 1);
                return;
            }
        }
    }

    public static int isMatch(String a, String b) {
        if (a.equals(b))
            return 0;
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) > b.charAt(j)) {
                return 1;
            }
            if (a.charAt(i) < b.charAt(j)) {
                return -1;
            }
            i++;
            j++;
        }
        if (i == a.length()) {
            return -1;
        }
        return 1;
    }
}
