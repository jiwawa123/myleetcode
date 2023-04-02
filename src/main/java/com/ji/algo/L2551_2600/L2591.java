package com.ji.algo.L2551_2600;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/02/18:15
 */
public class L2591 {
    public static void main(String[] args) {
        System.out.println(distMoney(16, 10));
    }

    public static int distMoney(int money, int children) {
        int magic = 8;
        if (money < children) {
            return -1;
        }
        if (money < magic || money <= children) {
            return 0;
        }
        int all = money / magic;
        int remain = money - all * magic;
        // 刚好全部平分
        if (all == children && all * magic == money) {
            return all;
        }
        // 分配不够
        if (all < children) {
            int needs = children - all;
            // 仅剩一个特殊情况
            if (needs == 1 && remain == 4) {
                return all - 1;
            }
            int child = all + remain;
            while (child < children) {
                all--;
                child += 8 - 1;
            }
            return all;

        }
        // 分配超了
        return children - 1;
    }
}
