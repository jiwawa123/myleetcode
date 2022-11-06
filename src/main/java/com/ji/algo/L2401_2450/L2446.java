package com.ji.algo.L2401_2450;

/**
 * @Author: Bei Chang
 * @Date: 2022/11/06/上午11:20
 */
public class L2446 {
    public static void main(String[] args) {

    }

    public boolean haveConflict(String[] event1, String[] event2) {
        return hasConflict(event1[0], event2) || hasConflict(event2[0], event1);
    }

    public boolean hasConflict(String event1, String event2[]) {
        int hh = Integer.valueOf(event1.substring(0, 2));
        int mm = Integer.valueOf(event1.substring(3, 5));
        int hh1 = Integer.valueOf(event2[0].substring(0, 2));
        int mm1 = Integer.valueOf(event2[0].substring(3, 5));

        int hh2 = Integer.valueOf(event2[1].substring(0, 2));
        int mm2 = Integer.valueOf(event2[1].substring(3, 5));

        boolean f1 = hh > hh1 || (hh == hh1 && mm >= mm1);
        boolean f2 = hh < hh2 || (hh == hh2 && mm <= mm2);
        return f1 && f2;

    }
}
