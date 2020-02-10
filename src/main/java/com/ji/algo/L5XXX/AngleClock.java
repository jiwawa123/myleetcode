package com.ji.algo.L5XXX;/*
    user ji
    data 2020/2/10
    time 12:25 PM
*/

public class AngleClock {
    public static void main(String[] args) {
        System.out.println(angleClock(1, 57));
    }

    public static double angleClock(int hour, int minutes) {
        double a1 = minutes * 1.0 / 60 * 360;
        double a2 = (hour % 12) * 1.0 / 12 * 360 + minutes * 1.0 / 60 * 360 / 12;
        return Math.abs(a1 - a2) > 180 ? 360 - Math.abs(a1 - a2) : Math.abs(a1 - a2);
    }
}
