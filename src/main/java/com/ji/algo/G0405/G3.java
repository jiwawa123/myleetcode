package com.ji.algo.G0405;

/**
 * user ji
 * data 2020/4/5
 * time 9:26 PM
 */
public class G3 {
    public static void main(String[] args) {

    }

    public boolean canConstruct(String s, int k) {
        if (s == null || s.length() < k) {
            return false;
        }
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += 1;
        }
        int odd = 0;
        int even = 0;
        for (int i = 0; i < 26; i++) {
            if (s.charAt(i) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }


        return odd <= k;

    }
}
