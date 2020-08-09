package com.ji.algo.G0808;

/**
 * user ji
 * data 2020/8/8
 * time 11:28 下午
 */
public class G2 {
    public static void main(String[] args) {
        String s = "atmtxzjkz", t = "tvbtjhvjd";
        System.out.println(canConvertString(s, t, 35));
    }

    public static boolean canConvertString(String s, String t, int k) {
        if (s.length() != t.length())
            return false;
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                continue;
            }
            int distance = (t.charAt(i) - s.charAt(i) + 26) % 26;

            if (arr[distance] == 0) {
                arr[distance] = distance;
            } else {
                arr[distance] += 26;
            }
            if (arr[distance] > k) {
                return false;
            }
        }
        return true;
    }
}
