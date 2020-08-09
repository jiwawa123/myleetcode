package com.ji.algo.jdd;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * user ji
 * data 2020/8/6
 * time 7:30 下午
 */
public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AtomicStampedReference tmp = new AtomicStampedReference(0, 0);
        int n = sc.nextInt();
        double t = 0.0;
        int f = 1;

        for (int i = 1; i <= 2 * n; i++) {
            t += f * 1.0 / (5 * i);
            f *= -1;
        }
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(t));
    }
}
