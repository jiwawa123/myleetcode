package com.ji.algo.L351_400;/*
    user ji
    data 2019/5/27
    time 9:20 AM
*/

public class IntegerReplacement {
    public static void main(String[] args) {

    }
    public int integerReplacement(int n) {
        if(n < 2)
            return 0;
        int res = 0;
        n = n == Integer.MAX_VALUE ? n - 1 : n; //这是个坑点。如果再加 1 就要超过int的范围了，也可以直接返回32

        for(;n != 1; res++)
            n = 0 == (n & 1) ? n >> 1   // 偶数, 直接右移
                    : 3 == (n & 3) && n != 3 ? n + 1 : n - 1;   //若 n 的最后两位是11，加1，之后可以连续做两次除法，降低了次数
        return res;
    }
}
