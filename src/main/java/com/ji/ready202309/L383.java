package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/01/10:01
 */
public class L383 {
    public static void main(String[] args) {

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (char a : magazine.toCharArray()) {
            arr[a - 'a'] += 1;
        }
        for (char t : ransomNote.toCharArray()
        ) {
            arr[t - 'a'] -= 1;
            if (arr[t - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
