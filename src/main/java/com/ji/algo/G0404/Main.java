package com.ji.algo.G0404;

import java.util.Scanner;

/**
 * user ji
 * data 2021/4/4
 * time 8:42 下午
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String tmp = scanner.next();
        if (tmp.length() == 1) {
            System.out.println(1);
            return;
        }
        int last = 0, cur = 0, next = 1;
        int count = 0;
        while (next < tmp.length()) {
            int cur_ = tmp.charAt(cur) - '0';
            int next_ = tmp.charAt(next) - '0';
            int last_ = tmp.charAt(last) - '0';
            if (cur_ + next_ == 10) {
                count += 2;
                next++;
                if (next < tmp.length())
                    next_ = tmp.charAt(next) - '0';
                else
                    break;
                while (next < tmp.length() && last < cur && next_ + last_ == 10) {
                    next++;
                    last--;
                    if (next < tmp.length())
                        next_ = tmp.charAt(next) - '0';
                    else
                        break;
                    if (last >= 0)
                        last_ = tmp.charAt(last) - '0';
                    count += 2;
                    if (last < 0) { // 消除结束，从新的地方开始
                        last = next;
                        cur = next;
                        next++;
                        break;
                    }
                }
                cur = next;
                next++;
            } else {
                last = cur;
                cur++;
                next++;
            }
        }
        System.out.println(tmp.length() - count);
    }
}
