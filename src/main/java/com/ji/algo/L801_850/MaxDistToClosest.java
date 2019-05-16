package com.ji.algo.L801_850;/*
    user ji
    data 2019/5/16
    time 4:51 PM
*/

public class MaxDistToClosest {
    public static void main(String[] args) {
        int arr[] = {0,0,1};
        System.out.println(maxDistToClosest(arr));
    }

    public static int maxDistToClosest(int[] seats) {
        int res = 0;
        boolean flag = false;
        int len = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                if (!flag) {
                    flag = true;
                    len++;
                } else {
                    len++;
                }
            } else {
                res = Math.max(res, (len + 1) / 2);
                flag = false;
                len = 0;
            }
        }
        if (flag) {
            res = Math.max(res, len);
        }
        int res1 = 0;
        boolean flag1 = false;
        int len1 = 0;
        for (int i = seats.length - 1; i >= 0; i--) {
            if (seats[i] == 0) {
                if (!flag1) {
                    flag1 = true;
                    len1++;
                } else {
                    len1++;
                }
            } else {
                res1 = Math.max(res1, (len1 + 1) / 2);
                flag1 = false;
                len1 = 0;
            }
        }
        if (flag1) {
            res1 = Math.max(res1, len1);
        }
        return res > res1 ? res : res1;
    }
}
