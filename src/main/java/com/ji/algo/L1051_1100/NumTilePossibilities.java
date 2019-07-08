package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/7/8
    time 5:40 PM
*/

import java.util.HashSet;
import java.util.Set;

public class NumTilePossibilities {
    public static void main(String[] args) {
        System.out.println(new NumTilePossibilities().numTilePossibilities("AAABBC"));
    }

    public int numTilePossibilities(String tiles) {

        char tmp[] = tiles.toCharArray();
        Set<String> set = new HashSet<>();
        boolean flag[] = new boolean[tiles.length()];
        help("", set, tmp,flag );
        return set.size();
    }

    public void help(String tmp, Set<String> set, char arr[], boolean flag[]) {
        if (tmp.length() > arr.length)
            return;

        if (!tmp.equals("") && tmp.length() <= arr.length) {
            set.add(tmp);
        }
        if (tmp.length() == arr.length)
            return;
        boolean f[] = new boolean[flag.length];
        for (int i = 0; i < flag.length; i++) {
            f[i] = flag[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (f[i]) {
                continue;
            } else {
                f[i] = true;
                help(tmp + arr[i], set, arr, f);
                f[i] = false;
            }
        }
    }
}
