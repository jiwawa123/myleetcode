package com.ji.algo.jdd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * user ji
 * data 2020/8/6
 * time 7:38 下午
 */
public class G1 {
    static Map<Integer, Integer> map = new HashMap();
    static Map<String, Integer> str = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m <= 10) {
            System.out.println(0);
            return;
        }
        int tmp = 0;
        for (int i = n; i <= m; i++) {
            if (isTrue(i + "")) {
                tmp++;
            }
        }

        System.out.println(tmp);
    }

    public static boolean isTrue(String tmp) {
        for (int i = 0; i < tmp.length(); i++) {
            String next = tmp.substring(0, i) + tmp.substring(i + 1);
            if (str.containsKey(next))
                return true;
            if (next.equals("")) {
                return false;
            }
            if (isTrueII(Integer.valueOf(next) + "")) {
                str.put(next, 1);
                return true;
            }
        }
        return false;
    }

    public static boolean isTrueII(String tmp) {
        int i = 0, j = tmp.length() - 1;
        while (i < j) {
            if (tmp.charAt(i++) != tmp.charAt(j--)) {
                return false;
            }
        }
        if (tmp.equals(""))
            return false;
        return isPrime(Integer.valueOf(tmp));
    }


    public static boolean isPrime(int num) {
        if (map.containsKey(num))
            return true;
        if (num <= 3) {
            return num > 1;
        }
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 5; i <= sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        map.put(num, 1);
        return true;
    }
}
