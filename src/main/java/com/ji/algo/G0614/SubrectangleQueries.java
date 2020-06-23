package com.ji.algo.G0614;

/**
 * user ji
 * data 2020/6/14
 * time 9:09 上午
 */
public class SubrectangleQueries {

    int rectangle[][];

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <=col2 ; j++) {
                rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }
}
