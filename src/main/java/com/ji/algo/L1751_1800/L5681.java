package com.ji.algo.L1751_1800;

/**
 * user ji
 * data 2021/3/7
 * time 9:57 下午
 */
public class L5681 {
    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(91));
    }

    public static boolean checkPowersOfThree(int n) {
        if (n == 1 || n == 3)
            return true;
        int index = 1000;
        while (n > 0) {
            //找出小于n的最大值
            int tmp = 1;
            boolean flag = false;
            for (int i = 0; i < index; i++) {
                if (tmp > n) {
                    n -= tmp / 3;
                    flag = true;
                    index = i;
                    break;
                }
                tmp *= 3;
            }
            if (!flag)
                return false;
        }


        return true;
    }
}
