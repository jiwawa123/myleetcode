package com.ji.algo.second;

/**
 * user ji
 * data 2020/8/16
 * time 3:47 下午
 */
public class L733 {
    public static void main(String[] args) {

    }

    boolean flag[][];

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image == null || image.length == 0)
            return image;
        int r = image.length;
        int c = image[0].length;
        flag = new boolean[r][c];
        help(image, sr, sc, newColor, image[sr][sc]);

        return image;
    }

    public void help(int[][] image, int sr, int sc, int newColor, int last) {
        if (sr >= image.length || sr < 0 || sc < 0 || sc > image[0].length)
            return;
        if (flag[sr][sc])
            return;
        if (image[sr][sc] != last)
            return;
        image[sr][sc] = newColor;
        flag[sr][sc] = true;
        help(image, sr + 1, sc, newColor, last);
        help(image, sr - 1, sc, newColor, last);
        help(image, sr, sc - 1, newColor, last);
        help(image, sr, sc + 1, newColor, last);

    }
}
