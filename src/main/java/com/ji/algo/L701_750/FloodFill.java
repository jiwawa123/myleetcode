package com.ji.algo.L701_750;/*
    user ji
    data 2019/5/30
    time 9:44 PM
*/

public class FloodFill {
    public static void main(String[] args) {
        int arr[][] = {{0, 0, 0}, {1, 0, 0},};
        new FloodFill().floodFill(arr, 1, 0, 2);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean flag[][] = new boolean[image.length][image[0].length];
        int tmp = image[sr][sc];
        help(image, sr, sc, flag, tmp);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (flag[i][j])
                    image[i][j] = newColor;
            }
        }
        return image;
    }

    public void help(int[][] image, int sr, int sc, boolean flag[][], int tmp) {
        System.out.println(sr + " " + sc);
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != tmp || flag[sr][sc])
            return;
        flag[sr][sc] = true;
        help(image, sr - 1, sc, flag, tmp);
        help(image, sr + 1, sc, flag, tmp);
        help(image, sr, sc - 1, flag, tmp);
        help(image, sr, sc + 1, flag, tmp);
    }
}
