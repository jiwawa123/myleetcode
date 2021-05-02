package com.ji.algo.G0418;

/**
 * user ji
 * data 2021/4/18
 * time 1:05 下午
 */
public class G1 {
    public static void main(String[] args) {

    }

    public int[] countPoints(int[][] points, int[][] queries) {
        int res[] = new int[queries.length];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < queries.length; j++) {
                if (Math.pow((points[i][0] - queries[j][0]), 2) +
                        Math.pow((points[i][1] - queries[j][1]), 2)
                        <= Math.pow((queries[j][2]), 2)
                )
                    res[j]++;
            }
        }
        return res;
    }

}
