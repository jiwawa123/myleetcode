package com.ji.algo.L2401_2450;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2022/09/18/下午12:23
 */
public class L6184 {
    public static void main(String[] args) {

    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aStartMonth = Integer.parseInt(arriveAlice.split("-")[0]);
        int aStartDay = Integer.parseInt(arriveAlice.split("-")[1]);
        int aEndMonth = Integer.parseInt(leaveAlice.split("-")[0]);
        int aEndDay = Integer.parseInt(leaveAlice.split("-")[1]);

        int bStartMonth = Integer.parseInt(arriveBob.split("-")[0]);
        int bStartDay = Integer.parseInt(arriveBob.split("-")[1]);
        int bEndMonth = Integer.parseInt(leaveBob.split("-")[0]);
        int bEndDay = Integer.parseInt(leaveBob.split("-")[1]);

        System.out.println(aEndMonth + " " + aEndDay + " " + bStartMonth + " " + bStartDay);

        int[] monthDay = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int[] dp = new int[monthDay.length];
        for (int i = 1; i < monthDay.length; i++) {
            dp[i] = dp[i - 1] + monthDay[i - 1];
        }
        int aliceStart = dp[aStartMonth - 1] + aStartDay;
        int aliceEnd = dp[aEndMonth - 1] + aEndDay;
        int bobStart = dp[bStartMonth - 1] + bStartDay;
        int bobEnd = dp[bEndMonth - 1] + bEndDay;

        System.out.println(aliceStart + " " + aliceEnd + " " + bobStart + " " + bobEnd);

        if (aliceStart > bobEnd || aliceEnd < bobStart) {
            return 0;
        }

        List<Integer> list = new ArrayList<>();
        if (aliceStart != aliceEnd) {
            for (int i = aliceStart; i <= aliceEnd; i++) {
                list.add(i);
            }
        } else {
            list.add(aliceStart);
        }
        int res = 0;
        if (bobStart == bobEnd) {
            return list.contains(bobStart) ? 1 : 0;
        }
        for (int i = bobStart; i <= bobEnd; i++) {
            if (list.contains(i)) {
                res++;
            }
        }
        return res;
    }
}
