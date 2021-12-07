package com.ji.algo.L2051_2100;

/**
 * @author ji
 * @data 2021/12/7
 * @time 10:58 下午
 */
public class L2068 {
    public static void main(String[] args) {

    }

    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] arr = new int[26];
        for (char a : word1.toCharArray()
        ) {
            arr[a - 'a'] += 1;
        }
        for (char b : word2.toCharArray()
        ) {
            arr[b - 'a'] -= 1;
            if(arr[b - 'a']<-3){
                return false;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(arr[i]>3)
                return false;
        }
        return true;
    }
}
