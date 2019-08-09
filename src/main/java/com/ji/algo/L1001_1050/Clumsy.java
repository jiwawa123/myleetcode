package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/8/9
    time 10:24 AM
*/

public class Clumsy {
    public static void main(String[] args) {
        System.out.println(clumsy(10));
    }

    public static int clumsy(int N) {
        int count = 0;
        boolean flag = true;
        while (N >= 4) {
            int tmp = N;
            int k = tmp * (tmp - 1) / (tmp - 2);
            count += tmp - 3;
            if (flag) {
                count += k;
                flag = false;
            } else {
                count -= k;
            }
            N -= 4;
        }
        int tmp = 0;
        if (N > 0) {
            switch (N) {
                case 1:
                    tmp = 1;
                    break;
                case 2:
                    tmp = 2 * 1;
                    break;
                case 3:
                    tmp = 6;
                    break;
            }
        }
        if (flag)
            return tmp;

        return count - tmp;
    }
}
