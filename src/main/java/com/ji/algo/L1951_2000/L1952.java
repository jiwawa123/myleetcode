package com.ji.algo.L1951_2000;

/**
 * @author ji
 * @data 2021/8/29
 * @time 8:57 下午
 */
public class L1952 {
    public static void main(String[] args) {

    }

    public boolean isThree(int n) {
        int sqrt = (int) Math.sqrt(n);
        int count = 1;
        for (int i = 2; i < sqrt; i++) {
            if (n % i == 0)
                count++;
            if (count > 3)
                return false;
        }
        return count == 3;
    }
}
