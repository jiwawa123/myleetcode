package com.ji.algo.L851_900;/*
    user ji
    data 2019/5/16
    time 2:05 PM
*/

import java.util.HashMap;
import java.util.Map;

public class LemonadeChange {
    public static void main(String[] args) {

    }

    public boolean lemonadeChange(int[] bills) {
        int arr[] = new int[2];
        for (int i = 0; i < bills.length; i++) {
            switch (bills[i]) {
                case 5:
                    arr[0] += 1;
                    break;
                case 10:
                    if (arr[0] < 1)
                        return false;
                    arr[0] -= 1;
                    arr[1] += 1;
                    break;
                case 20:
                    int tmp = 15;
                    if (arr[1] > 0) {
                        arr[1] -= 1;
                        tmp = 5;
                    }
                    while (tmp > 0) {
                        if (arr[0] < 0)
                            return false;
                        arr[0] -= 1;
                        tmp -= 5;
                    }
                    break;
            }
        }
        return true;
    }
}
