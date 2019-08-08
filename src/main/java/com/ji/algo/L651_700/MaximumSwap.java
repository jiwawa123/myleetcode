package com.ji.algo.L651_700;/*
    user ji
    data 2019/8/8
    time 1:35 PM
*/

public class MaximumSwap {
    public static void main(String[] args) {
        MaximumSwap swap = new MaximumSwap();
        System.out.println(swap.maximumSwap(9973));
    }

    public int maximumSwap(int num) {
        String str = "" + num;
        boolean flag = false;
        char[] tmp = str.toCharArray();
        for (int i = 0; i < tmp.length; i++) {
            if (flag)
                break;
            for (int j = i + 1; j < tmp.length; j++) {
                if (tmp[i] < tmp[j]) {
                    change(tmp, i, j);
                    if (str.compareTo(String.valueOf(tmp)) < 0) {
                        str = String.valueOf(tmp);
                    }
                    change(tmp, i, j);
                    flag = true;
                }
            }
        }
        return Integer.valueOf(str);
    }

    public void change(char[] tmp, int a, int b) {
        char c = tmp[a];
        tmp[a] = tmp[b];
        tmp[b] = c;
    }
}
