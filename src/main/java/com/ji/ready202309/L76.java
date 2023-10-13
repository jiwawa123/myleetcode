package com.ji.ready202309;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/29/21:24
 */
public class L76 {
    public static void main(String[] args) {
        new L76().minWindow("ab", "a");
    }


    public String minWindow(String s, String t) {
        String res = "";
        if (t.length() > s.length()) {
            return res;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        Map<Character, Integer> cur = new HashMap<>();
        int key = 0;
        int len = Integer.MAX_VALUE;
        int left = 0, right = 0;
        while (right < s.length()) {
            while (key == map.size()) {
                if (!map.containsKey(s.charAt(left))) {
                    left++;
                    if (right - left <= len) {
                        len = right - left;
                        res = s.substring(left, right);
                    }
                } else {
                    if (cur.get(s.charAt(left)) > map.get(s.charAt(left))) {
                        cur.put(s.charAt(left), cur.get(s.charAt(left)) - 1);
                        left++;
                        if (right - left <= len) {
                            len = right - left;
                            res = s.substring(left, right);
                        }
                    } else {
                        break;
                    }

                }
            }

            if (map.containsKey(s.charAt(right))) {
                cur.put(s.charAt(right), cur.getOrDefault(s.charAt(right), 0) + 1);
                if (cur.get(s.charAt(right)).equals(map.get(s.charAt(right)))) {
                    key++;
                }
                right++;
                if (key == map.size()) {
                    if (right - left <= len) {
                        len = right - left;
                        res = s.substring(left, right);
                    }
                }
                continue;
            }
            right++;

        }
        while (key == map.size()) {
            if (right - left <= len) {
                len = right - left;
                res = s.substring(left, right);
            }
            if (left < s.length() && !map.containsKey(s.charAt(left))) {
                left++;
                if (right - left <= len) {
                    len = right - left;
                    res = s.substring(left, right);
                }
            } else {
                if (left < s.length() && cur.get(s.charAt(left)) > map.get(s.charAt(left))) {
                    cur.put(s.charAt(left), cur.get(s.charAt(left)) - 1);
                    left++;
                    if (right - left <= len) {
                        len = right - left;
                        res = s.substring(left, right);
                    }
                } else {
                    key--;
                }

            }
        }

        return res;
    }
}
