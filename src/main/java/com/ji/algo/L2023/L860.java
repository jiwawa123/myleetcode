package com.ji.algo.L2023;

/**
 * @Author: Bei Chang
 * @Date: 2023/05/03/09:26
 */
public class L860 {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5, 10, 5, 10, 10, 10, 20};
        System.out.println(lemonadeChange(arr));
    }

    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            switch (bill) {
                case 5:
                    five++;
                    break;
                case 10:
                    ten++;
                    five--;
                    if (five < 0) {
                        return false;
                    }
                    break;
                default:
                    bill -= 5;
                    if (ten > 0) {
                        ten--;
                        bill -= 10;
                    }
                    while (bill > 0) {
                        if (five > 0) {
                            bill -= 5;
                            five--;
                        } else {
                            return false;
                        }
                    }
            }
        }

        return true;
    }
}
