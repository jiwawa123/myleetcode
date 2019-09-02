package com.ji.algo.L1151_1200;/*
    user ji
    data 2019/9/2
    time 10:34 AM
*/

import java.util.ArrayList;
import java.util.List;

public class CanMakePaliQueries {
    public static void main(String[] args) {

    }

    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int n = s.length();
        int arr[][] = new int[n][26];
        arr[0][s.charAt(0)] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 26; j++) {
                arr[i][j] = arr[i - 1][j];
            }
            arr[i][s.charAt(i) - 'a'] += arr[i - 1][s.charAt(i) - 'a'];
        }
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            int tmp[] = queries[i];
            for (int j = 0; j < 26; j++) {
                if (tmp[0] == 0)
                    count += (arr[tmp[1]][j]) % 2;
                else
                    count += (arr[tmp[1]][j] - arr[tmp[0] - 1][j]) % 2;
            }
            if (count / 2 < tmp[2])
                list.add(true);
            else
                list.add(false);
        }
        return list;

    }
}
