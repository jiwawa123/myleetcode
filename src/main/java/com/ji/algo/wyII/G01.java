package com.ji.algo.wyII;

import java.util.Scanner;

public class G01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.next();
        if (tmp.length() < 2) {
            System.out.println(0);
            return;
        }
        int res = 0;
        for (int i = 0; i < tmp.length(); i++) {
            for (int j = i + 2; j <= tmp.length(); j++) {
                if (isPar(tmp.substring(i, j))) {
                    res++;
                }
            }
        }
        System.out.println(res);

    }

    public static boolean isPar(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--))
                return false;
        }
        return true;
    }

}
