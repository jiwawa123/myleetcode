package com.ji.algo.G0517;

/**
 * user ji
 * data 2020/5/17
 * time 4:16 下午
 */
public class G1 {
    public static void main(String[] args) {

    }

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime)
                res++;
        }
        return res;
    }
}
