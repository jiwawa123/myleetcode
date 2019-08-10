package com.ji.algo.L551_600;/*
    user ji
    data 2019/8/10
    time 9:42 PM
*/

public class FractionAddition {
    public static void main(String[] args) {
        System.out.println(fractionAddition("29/6-3/10"));
    }

    public static String fractionAddition(String expression) {
        if (expression == null || expression.equals("") || expression.equals("0"))
            return "0/1";
        int flag = 1;
        int up = 0, down = 1;
        int start = 0, end = 1;
        boolean tmp = false;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '-' || expression.charAt(i) == '+') {
                if (end > 100) {
                    end -= 100;
                } else if (end > 10) {
                    end -= 10;
                } else if (end > 1) {
                    end -= 1;
                }
                int down1 = down * end;
                int up1 = flag == -1 ? up * end - down * start : up * end + down * start;
                if (up1 == 0) {
                    up = 0;
                    down = 1;
                } else {
                    int maxD = getMaxDev(up1, down1);
                    up = up1 / maxD;
                    down = down1 / maxD;
                }
                tmp = false;
                start = 0;
                end = 1;
                flag = expression.charAt(i) == '-' ? -1 : 1;
                continue;
            }
            if (expression.charAt(i) == '/') {
                tmp = !tmp;
                continue;
            }
            if (!tmp) {
                start = start * 10 + (expression.charAt(i) - '0');
            } else {
                end = end * 10 + (expression.charAt(i) - '0');
            }
        }
        if (end > 100) {
            end -= 100;
        } else if (end > 10) {
            end -= 10;
        } else if (end > 1) {
            end -= 1;
        }
        int down1 = down * end;
        int up1 = flag == -1 ? up * end - down * start : up * end + down * start;
        if (up1 == 0) {
            up = 0;
            down = 1;
        } else {
            int maxD = getMaxDev(up1, down1);
            up = up1 / maxD;
            down = down1 / maxD;
        }
        return up + "/" + down;
    }

    //求两个数字的最大公约数
    public static int getMaxDev(int x, int y) {
        if (x < 0)
            x = -x;
        if (y < 0)
            y = -y;
        if (x < y) {//x,y互换
            int z = x;
            x = y;
            y = z;
        }
        int i = x % y;
        while (i != 0) {
            x = y;
            y = i;
            i = x % y;
        }
        return y;
    }
}
