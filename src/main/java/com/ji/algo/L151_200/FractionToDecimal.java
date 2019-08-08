package com.ji.algo.L151_200;/*
    user ji
    data 2019/8/8
    time 7:49 PM
*/

import java.util.HashMap;
import java.util.Map;

public class FractionToDecimal {
    public static void main(String[] args) {
        System.out.println(new FractionToDecimal().fractionToDecimal(-1, -2147483648));
    }

    public String fractionToDecimal(int numerator, int denominator) {
        long t1 = numerator;
        long t2 = denominator;
        if (t1 == 0)
            return 0 + "";
        boolean flag = true;
        if (t1 < 0) {
            flag = !flag;
            t1 = -t1;
        }
        if (t2 < 0) {
            flag = !flag;
            t2 = -t2;
        }
        String tmp = "";
        if (!flag) {
            tmp = "-";
        }
        StringBuilder sp = new StringBuilder();
        if (t1 >= t2) {
            if (t1 % t2 == 0) {
                return tmp + (t1 / t2) + "";
            } else {
                return tmp + (t1 / t2) + "." + fractionToDecimalII((int) (t1 - t1 / t2 * t2), t2, sp);
            }
        }
        return tmp + "0." + fractionToDecimalII((int) t1, t2, sp);
    }

    Map<Long, Integer> map = new HashMap<>();

    public String fractionToDecimalII(long numerator, long denominator, StringBuilder sp) {
        while (numerator < denominator) {
            numerator *= 10;
            if (numerator < denominator) {
                sp.append(0);
            }
        }
        if (map.containsKey(numerator)) {
            int index = map.get(numerator);
            sp.insert(index, '(');
            sp.append(")");
            return sp.toString();
        }
        map.put(numerator, sp.length());
        if (numerator % denominator == 0) {
            sp.append(numerator / denominator);
            return sp.toString();
        } else {
            sp.append(numerator / denominator);
            return fractionToDecimalII(numerator - numerator / denominator * denominator, denominator, sp);
        }

    }
}
