package com.ji.algo.hw;

import java.util.Scanner;

/**
 * user ji
 * data 2020/8/19
 * time 7:01 下午
 */
public class G1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m<10||m>1000||n<10||n>1000){
            System.out.println("[]");
            return;
        }
        int index = 0;
        int l = 0, r = n - 1, t = 0, b = m - 1;
        StringBuilder sp = new StringBuilder();
        while (true) {
            for (int i = l; i <= r; i++) {
                index++;
                if (help(index)) {
                    sp.append("[" + t + "," + i + "],");
                }
            }
            if (++t > b) {
                break;
            }
            for (int i = t; i <= b; i++) {
                index++;
                if (help(index))
                    sp.append("[" + i + "," + r + "],");

            }
            if (l > --r) break;
            for (int i = r; i >= l; i--) {
                index++;
                if (help(index))
                    sp.append("[" + b + "," + i + "],");
            }
            if (t > --b) break;
            for (int i = b; i >= t; i--) {
                index++;
                if (help(index))
                    sp.append("[" + i + "," + l + "],");
            }
            if (++l > r) break;
        }

        System.out.print("[");
        if (sp.length() > 0)
            System.out.print(sp.substring(0, sp.length() - 1));
        System.out.print("]");
    }

    public static boolean help(int x) {
        if (x < 10)
            return false;
        int tmp = x % 10;
        if (tmp != 7)
            return false;
        tmp = x / 10 % 10;
        if (tmp % 2 == 0)
            return false;
        return true;
    }

}
