package com.ji.algo.wyII;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * user ji
 * data 2020/9/12
 * time 2:59 下午
 */
public class G2 {
    static Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        map.put('a', 1);
        map.put('b', 1);
        map.put('c', 1);
        map.put('x', 1);
        map.put('y', 1);
        map.put('z', 1);
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length(); j > i; j--) {
                if (j - i < res)
                    break;
                if (isTrue(str.substring(i, j))) {
                    res = Math.max(res, j - i);
                }
            }
        }
        System.out.println(res);
    }

    public static boolean isTrue(String t) {
        int arr[] = new int[26];
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                arr[t.charAt(i) - 'a']++;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (arr[i] % 2 != 0)
                return false;
        }
        for (int i = 23; i < 26; i++) {
            if (arr[i] % 2 != 0)
                return false;
        }
        return true;
    }
}
