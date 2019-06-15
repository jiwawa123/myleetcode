package com.ji.algo.L601_650;/*
    user ji
    data 2019/6/15
    time 9:16 AM
*/

public class CanPlaceFlowers {
    public static void main(String[] args) {

    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null || flowerbed.length * 2 < n)
            return false;

        for (int i = 0; i < flowerbed.length; i++) {
            if (n == 0) return true;
            if (flowerbed[i] == 1) continue;
            //判断在一开始的位置和结束的位置开始种花
            if (i == 0) {
                if (flowerbed.length == 1) {
                    n--;
                    flowerbed[i] = 1;
                } else {
                    if (flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
                continue;
            }
            if (i == flowerbed.length - 1) {
                if (flowerbed.length == 1) {
                    n--;
                    flowerbed[i] = 1;
                } else {
                    if (flowerbed[i - 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
                continue;
            }
            //考虑别的情况开始种花
            if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                n--;
                flowerbed[i] = 1;
            }
        }
        return n == 0;
    }
}
