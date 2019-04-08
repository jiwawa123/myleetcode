package com.ji.algo.L0_100;/*
    user ji
    data 2019/4/8
    time 10:10 AM
*/

public class IntToRoman {
    public static void main(String[] args) {

    }

    public String intToRoman(int num) {
        StringBuffer sp = new StringBuffer();
        while (num > 0) {
            while (num >= 1000) {
                sp.append('M');
                num -= 1000;
            }
            while (num >= 900) {
                sp.append("CM");
                num -= 900;
            }
            while (num >= 500) {
                sp.append('D');
                num -= 500;
            }
            while (num >= 400) {
                sp.append("CD");
                num -= 400;
            }
            while (num >= 100) {
                sp.append('C');
                num -= 100;
            }
            while (num >= 90) {
                sp.append("XC");
                num -= 90;
            }
            while (num >= 50) {
                sp.append("L");
                num -= 50;
            }
            while (num >= 40) {
                sp.append("XL");
                num -= 40;
            }
            while (num >= 10) {
                sp.append("X");
                num -= 10;
            }
            while (num >= 9) {
                sp.append("IX");
                num -= 9;
            }
            while (num >= 5) {
                sp.append("V");
                num -= 5;
            }
            while (num >= 4) {
                sp.append("IV");
                num -= 4;
            }
            while (num >= 1) {
                sp.append("I");
                num -= 1;
            }

        }
        return sp.toString();
    }
}
