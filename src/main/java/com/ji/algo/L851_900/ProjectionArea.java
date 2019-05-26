package com.ji.algo.L851_900;/*
    user ji
    data 2019/5/26
    time 7:44 PM
*/

public class ProjectionArea {
    public static void main(String[] args) {

    }

    public int projectionArea(int arr[][]) {
        int count = 0;
        //计算底面积
        for (int i = 0; i < arr.length; i++) {
            int tmp = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > 0)
                    count++;
                tmp = Math.max(tmp, arr[i][j]);
            }
            count += tmp;
        }
        for (int i = 0; i < arr[0].length; i++) {
            int tmp = 0;
            for (int j = 0; j < arr.length; j++) {
                tmp = Math.max(tmp, arr[j][i]);
            }
            count += tmp;
        }
        return count;
    }
}
