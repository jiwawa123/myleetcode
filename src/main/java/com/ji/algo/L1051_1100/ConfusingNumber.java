package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/9/10
    time 3:14 PM
*/

public class ConfusingNumber {
    public static void main(String[] args) {

    }

    public boolean isConfusingNumber(int k) {
        int arr[] = {0, 0, 1, 1, 1, 1, 0, 1, 0, 0};
        char tmp[] = (k + "").toCharArray();
        int i = 0, j = tmp.length - 1;
        while (i < j) {
            if (arr[tmp[i] - '0'] == 1)
                return false;
            if (arr[tmp[j] - '0'] == 1)
                return false;
            char t = tmp[i];
            tmp[i] = tmp[j];
            tmp[j] = t;
            i++;
            j--;
        }
        return !(k+"").equals(String.valueOf(tmp));
    }
}
