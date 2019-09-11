package com.ji.algo.L251_300;/*
    user ji
    data 2019/9/11
    time 2:07 PM
*/

public class FindtheCelebrity {
    public static void main(String[] args) {

    }

    public int getCelebrity(int arr[][]) {
        int res = -1;
        for (int i = 0; i < arr[0].length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] == 0) {
                    break;
                }
                count++;
            }
            if (count == arr.length) {
                int count1 = 0;
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == 1) {
                        if (j != i)
                            break;
                    } else {
                        count1++;
                    }
                }
                if (count1 == 1)
                    return i;
            }
        }
        return res;
    }
}
