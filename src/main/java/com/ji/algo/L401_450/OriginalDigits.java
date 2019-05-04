package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/4
    time 10:15 AM
*/

import java.util.Arrays;

public class OriginalDigits {
    public static void main(String[] args) {

    }

    public String originalDigits(String s) {
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += 1;
        }
        StringBuffer sp = new StringBuffer();
        //0
        while (arr['z' - 'a'] > 0) {
            sp.append(0);
            arr['z' - 'a']--;
            arr['e' - 'a']--;
            arr['r' - 'a']--;
            arr['o' - 'a']--;
        }
        //2
        while (arr['w' - 'a'] > 0) {
            sp.append(2);
            arr['t' - 'a']--;
            arr['w' - 'a']--;
            arr['o' - 'a']--;
        }
        //8
        while (arr['g' - 'a'] > 0) {
            sp.append(8);
            arr['e' - 'a']--;
            arr['i' - 'a']--;
            arr['g' - 'a']--;
            arr['h' - 'a']--;
            arr['t' - 'a']--;
        }
        //4
        while (arr['u' - 'a'] > 0) {
            sp.append(4);
            arr['f' - 'a']--;
            arr['o' - 'a']--;
            arr['u' - 'a']--;
            arr['r' - 'a']--;
        }
        //6
        while (arr['x' - 'a'] > 0) {
            sp.append(6);
            arr['s' - 'a']--;
            arr['i' - 'a']--;
            arr['x' - 'a']--;
        }
        //7
        while (arr['s' - 'a'] > 0) {
            sp.append(7);
            arr['s' - 'a']--;
            arr['e' - 'a']--;
            arr['v' - 'a']--;
            arr['e' - 'a']--;
            arr['n' - 'a']--;
        }
        //5
        while (arr['f' - 'a'] > 0) {
            sp.append(5);
            arr['f' - 'a']--;
            arr['i' - 'a']--;
            arr['v' - 'a']--;
            arr['e' - 'a']--;

        }
        //3
        while (arr['t' - 'a'] > 0) {
            sp.append(3);
            arr['t' - 'a']--;
            arr['h' - 'a']--;
            arr['r' - 'a']--;
            arr['e' - 'a']--;
            arr['e' - 'a']--;
        }
        //0
        while (arr['o' - 'a'] > 0) {
            sp.append(0);
            arr['o' - 'a']--;
            arr['n' - 'a']--;
            arr['e' - 'a']--;
        }
        //9
        while (arr['i' - 'a'] > 0) {
            sp.append(9);
            arr['n' - 'a']--;
            arr['i' - 'a']--;
            arr['n' - 'a']--;
            arr['e' - 'a']--;
        }
        char tmp[] = sp.toString().toCharArray();
        Arrays.sort(tmp);
        return String.valueOf(tmp);
    }
}
