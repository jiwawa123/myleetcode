package com.ji.algo.L251_300;/*
    user ji
    data 2019/9/9
    time 3:52 PM
*/

public class Vector2D {
    public int arr[][];
    public int raw, col;

    public Vector2D(int arr[][]) {
        this.arr = arr;
    }

    public static void main(String[] args) {

    }

    public int next() {
        int tmp = arr[raw][col];
        if (arr[raw].length == col) {
            raw++;
            col = 0;
        } else {
            col++;
        }
        return tmp;
    }

    public boolean hasNext() {
        if (raw < arr.length - 1)
            return true;
        if (col < arr[raw].length)
            return true;
        return false;
    }
}
