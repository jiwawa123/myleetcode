package com.ji.algo.L1701_1750;

import java.util.HashSet;
import java.util.Set;

/**
 * user ji
 * data 2021/1/28
 * time 10:55 上午
 */
public class L1733 {
    public static void main(String[] args) {

    }

    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int count = languages.length;
        int len = friendships.length;
        boolean flag[] = new boolean[len];
        int tmp = 0;
        // 判断直接可以聊天的群体
        for (int i = 0; i < len; i++) {
            int start = friendships[i][0];
            int end = friendships[i][1];
            if (help(languages[start - 1], languages[end - 1], n)) {
                flag[i] = true;
                tmp++;
            }
        }
        Set<Integer>[] set = new HashSet[languages.length + 1];

        for (int i = 0; i < languages.length; i++) {
            set[i + 1] = new HashSet<>();
            for (int j = 0; j < languages[i].length; j++) {
                set[i + 1].add(languages[i][j]);
            }
        }
        if (tmp == len)
            return 0;
        for (int i = 1; i <= n; i++) {
            int min = 0;
            Set<Integer> inter = new HashSet<>();
            for (int j = 0; j < friendships.length; j++) {
                if (flag[j])
                    continue;
                int start = friendships[j][0];
                int end = friendships[j][1];
                if(!set[start].contains(i)&&!inter.contains(start)){
                    inter.add(start);
                    min++;
                }
                if(!set[end].contains(i)&&!inter.contains(end)){
                    inter.add(end);
                    min++;
                }
            }
            count = Math.min(min,count);
        }
        return count;
    }


    public boolean help(int arr1[], int arr2[], int n) {
        int arr[] = new int[n + 1];
        for (int a : arr1
        ) {
            arr[a] = 1;
        }
        for (int a : arr2
        ) {
            if (arr[a] == 1)
                return true;
        }
        return false;
    }
}
