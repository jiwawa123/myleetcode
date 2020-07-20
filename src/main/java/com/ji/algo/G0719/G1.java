package com.ji.algo.G0719;

/**
 * user ji
 * data 2020/7/19
 * time 10:10 上午
 */
public class G1 {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(15, 4));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        int res = numBottles;
        while (count >= numExchange) {
            int tmp = (count / numExchange);
            int last = count % numExchange;
            res += tmp;
            count = tmp + last;
        }

        return res;
    }
}
