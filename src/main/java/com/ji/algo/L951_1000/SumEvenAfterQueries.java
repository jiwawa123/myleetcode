package com.ji.algo.L951_1000;/*
    user ji
    data 2019/5/24
    time 8:31 AM
*/

public class SumEvenAfterQueries {
    public static void main(String[] args) {

    }

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        boolean flag[] = new boolean[A.length];
        int res[] = new int[queries.length];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                count += A[i];
                flag[i] = true;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            if (flag[queries[i][0]]) {
                if ((A[i] + queries[i][1]) % 2 != 0) {
                    count -= A[i];
                    flag[queries[i][0]] = false;
                } else {
                    count += queries[i][1];
                }
                A[i] += queries[i][1];
            } else {
                if ((A[i] + queries[i][1]) % 2 == 0) {
                    count += A[i] + queries[i][1];
                    flag[queries[i][0]] = true;
                }
                A[i] += queries[i][1];

            }
            res[i] = count;
        }
        return res;
    }
}
