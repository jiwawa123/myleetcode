package com.ji.algo.L601_650;/*
    user ji
    data 2019/8/4
    time 9:18 AM
*/

import java.util.*;

public class ExclusiveTime {
    public static void main(String[] args) {
        List<String> logs = Arrays.asList("0:start:0", "1:start:2", "1:end:5", "0:end:6");
        int arr[] = exclusiveTime(2, logs);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    public static int[] exclusiveTime(int n, List<String> logs) {
        int[] ret = new int[n];
        Deque<int[]> st = new ArrayDeque<>();
        for(String log : logs) {
            String[] stamp = log.split(":");
            if(stamp[1].equals("start"))
                st.push(new int[]{Integer.parseInt(stamp[0]), Integer.parseInt(stamp[2])});
            else {
                int[] fun = st.poll();
                int exectime = Integer.parseInt(stamp[2]) - fun[1] + 1;
                ret[fun[0]] += exectime;
                if(!st.isEmpty())
                    ret[st.peek()[0]] -= exectime;
            }
        }
        return ret;
    }
}
