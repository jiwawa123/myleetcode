package com.ji.algo.G0322;

/**
 * user ji
 * data 2020/3/22
 * time 10:29 AM
 */
public class G3 {
    public static void main(String[] args) {
        G3 g3 = new G3();
        int[][] arr = {{1, 1, 2}};
        System.out.println(g3.hasValidPath(arr));
    }

    //广度搜索即可
    boolean flag[][];
    boolean res = false;

    public boolean hasValidPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        flag = new boolean[m][n];
        help(m, n, grid, 0, 0, -1);
        return res;
    }

    public void help(int m, int n, int[][] grid, int x, int y, int status) {
        if (res)
            return;
        if (x < 0 || y < 0 || x >= m || y >= n || flag[x][y]) {
            return;
        }
        flag[x][y] = true;
        if (status != -1) {
            switch (status) {
                case 1:
                    if (grid[x][y] == 2)
                        return;
                    break;
                case 2:
                    if (grid[x][y] == 1) {
                        return;
                    }
                    break;
            }
        }
        if (x == m - 1 && y == n - 1) {
            res = true;
            return;
        }

        switch (grid[x][y]) {
            case 1:
                help(m, n, grid, x, y - 1, 1);
                help(m, n, grid, x, y + 1, 1);
                break;
            case 2:
                help(m, n, grid, x - 1, y, 2);
                help(m, n, grid, x + 1, y, 2);
                break;
            case 3:
                help(m, n, grid, x, y - 1, 3);
                help(m, n, grid, x + 1, y, 3);
                break;
            case 4:
                help(m, n, grid, x, y + 1, 4);
                help(m, n, grid, x + 1, y, 4);
                break;
            case 5:
                help(m, n, grid, x, y - 1, 5);
                help(m, n, grid, x - 1, y, 5);
                break;
            case 6:
                help(m, n, grid, x, y + 1, 6);
                help(m, n, grid, x - 1, y, 6);
                break;
        }
    }
}
