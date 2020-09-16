package com.ji.algo.G0913;

/**
 * user ji
 * data 2020/9/13
 * time 3:09 下午
 */
public class G1 {
    public static void main(String[] args) {

    }

    public int numSpecial(int[][] mat) {
        int res = 0;
        for (int i = 0; i < mat.length; i++) {
            int index = -1;
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                    index = j;
                }
                if (count > 1) {
                    break;
                }
            }
            if (count == 1) {
                int all = 0;
                for (int j = 0; j < mat.length; j++) {
                    if (mat[j][index] == 1) {
                        all++;
                    }
                    if (all > 1)
                        break;
                }
                if (all == 1) {
                    res++;
                }
            }
        }
        return res;
    }
}
