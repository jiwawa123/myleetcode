package com.ji.algo.L0_50;/*
    user ji
    data 2019/7/28
    time 4:14 PM
*/

import java.math.BigInteger;

public class Multiply {
    public static void main(String[] args) {
        System.out.println(multiply("1","2"));
    }

    public static String multiply(String num1, String num2) {
        BigInteger bigInteger = new BigInteger(num1);
        BigInteger bigInteger1 = bigInteger.multiply(new BigInteger(num2));
        return bigInteger1 + "";

    }
}
