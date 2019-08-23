package com.ji.algo.L351_400;/*
    user ji
    data 2019/8/23
    time 9:49 AM
*/

public class CanMeasureWater {
    public static void main(String[] args) {
        System.out.println(getMaxCd(12, 8));
    }

    public boolean canMeasureWater(int x, int y, int z) {
        if(z==0)
            return true;
        if(x+y<z)
            return false;
        int tmp = getMaxCd(x,y);
        if(tmp==0)
            return false;
        return z%(tmp)==0;
    }

    public static int getMaxCd(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int c;
        a = max;
        b = min;
        for (c = a % b; c > 0; c = a % b) {
            a = b;
            b = c;
        }
        return b;
    }
}
