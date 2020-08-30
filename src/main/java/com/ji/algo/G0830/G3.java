package com.ji.algo.G0830;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;

/**
 * user ji
 * data 2020/8/30
 * time 10:29 上午
 */
public class G3 {
    public static void main(String[] args) {
        int arr[][] = {{1, 1, 1, 1, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 1, 1, 1, 1},
                {0, 0, 0, 1, 0, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }


    boolean vis[][];

    public int get(int g[][]) {

        int l = g.length;
        int ll = g[0].length;

        vis = new boolean[l][ll];
        int r = 0;
        for (int j = 0; j < l; ++j) {
            for (int k = 0; k < ll; ++k) {
                if (g[j][k] == 1 && !vis[j][k]) {
                    dfs(j, k, g);
                    r++;
                }
            }
        }
        return r;
    }

    public void dfs(int i, int j, int g[][]) {
        int l = g.length;
        int ll = g[0].length;
        if (i < 0 || j < 0 || i >= l || j >= ll || g[i][j] == 0 || vis[i][j]) {
            return;
        }
        vis[i][j] = true;
        dfs(i + 1, j, g);
        dfs(i - 1, j, g);
        dfs(i, j + 1, g);
        dfs(i, j - 1, g);

    }


    public int minDays(int[][] g) {
        int num = get(g);
        if (num >= 2) return 0;

        int l = g.length;
        int ll = g[0].length;

        for (int j = 0; j < l; ++j) {
            for (int k = 0; k < ll; ++k) {
                if (g[j][k] == 1) {
                    g[j][k] = 0;

                    int r = get(g);
                    if (r >= 2) {
                        return 1;
                    }

                    g[j][k] = 1;
                }

            }
        }
        return 2;
    }
}
