package com.ji.algo.L5XXX;/*
    user ji
    data 2020/2/10
    time 1:07 PM
*/

public class MinSteps {
    public static void main(String[] args) {

    }

    public int minSteps(String s, String t) {
        int count = 0;
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < t.length(); i++) {
            if(arr[t.charAt(i)-'a']>0){
                arr[t.charAt(i)-'a'] -= 1;
            }else{
                count++;
            }
        }

        return count;
    }
}
