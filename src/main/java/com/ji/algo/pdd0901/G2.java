package com.ji.algo.pdd0901;

import java.util.*;

/**
 * user ji
 * data 2020/9/1
 * time 6:58 下午
 */
public class G2 {


    static int count = 0;
    static boolean flag[][];
    static int color[][];
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        int next = 1;
        flag = new boolean[row][col];
        color = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!flag[i][j] && arr[i][j] == 1) {
                    count = 0;
                    dfs(i, j, arr, next);
                    map.put(next++, count);
                }
            }
        }
        if (map.size() == 1) {
            System.out.println(map.get(1));
            return;
        } else {
            int max = 0;
//            for (int i = 0; i < row; i++) {
//                System.out.println(Arrays.toString(color[i]));
//            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (arr[i][j] == 0) {
                        max = Math.max(createMax(i, j, arr), max);
                    }
                }
            }
            System.out.println(max);
        }

    }

    public static int createMax(int i, int j, int arr[][]) {
        int r = 0;
        int l = 0;
        int u = 0;
        int d = 0;
        Set<Integer> set = new HashSet<>();
        if (i < arr.length - 1 && color[i + 1][j] != 0) {
            if (!set.contains(color[i + 1][j])) {
                r = map.get(color[i + 1][j]);
                set.add(color[i + 1][j]);
            }

        }

        if (i > 0 && color[i - 1][j] != 0) {
            if (!set.contains(color[i - 1][j])) {
                l = map.get(color[i - 1][j]);
                set.add(color[i - 1][j]);
            }
        }
        if (j > 0 && color[i][j - 1] != 0) {
            if (!set.contains(color[i][j - 1])) {
                u = map.get(color[i][j - 1]);
                set.add(color[i][j - 1]);
            }
        }
        if (j < arr[0].length - 1 && color[i][j + 1] != 0) {
            if (!set.contains(color[i][j + 1])) {
                d = map.get(color[i][j + 1]);
                set.add(color[i][j + 1]);
            }
        }
        int res = l + r + d + u;
        if (map.size() > set.size()) {
            res += 1;
        }
        return res;
    }


    public static void dfs(int x, int y, int arr[][], int col) {
        if (x < 0 || x > arr.length - 1 || y < 0 || y > arr[0].length - 1) {
            return;
        }
        if (arr[x][y] == 0 || flag[x][y])
            return;
        count++;
        color[x][y] = col;
        flag[x][y] = true;
        dfs(x + 1, y, arr, col);
        dfs(x - 1, y, arr, col);
        dfs(x, y + 1, arr, col);
        dfs(x, y - 1, arr, col);

    }
}
