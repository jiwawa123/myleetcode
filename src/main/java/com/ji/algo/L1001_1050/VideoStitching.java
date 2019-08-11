package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/8/11
    time 8:22 AM
*/

import java.util.*;

public class VideoStitching {
    public static void main(String[] args) {
        int arr[][] = {{0,5},{1,6},{2,7},{3,8},
                {4,9},{5,10},{6,11},{7,12},{8,13},
                {9,14},{10,15},{11,16},{12,17},{13,18},
                {14,19},{15,20},{16,21},{17,22},{18,23},
                {19,24},{20,25},{21,26},{22,27},{23,28},
                {24,29},{25,30},{26,31},{27,32},{28,33},
                {29,34},{30,35},{31,36},{32,37},{33,38},
                {34,39},{35,40},{36,41},{37,42},{38,43},
                {39,44},{40,45},{41,46},{42,47},{43,48},
                {44,49},{45,50},{46,51},{47,52},{48,53},{49,54}};
        System.out.println(videoStitching(arr, 50));
    }

    public static int videoStitching(int[][] clips, int T) {
        int arr[] = new int[T + 1];
        List<int[]> tmp = new ArrayList<>();
        for (int[] a : clips
                ) {
            tmp.add(a);
        }
        Collections.sort(tmp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
        Arrays.fill(arr, Integer.MAX_VALUE);
        for (int i = 0; i < tmp.size(); i++) {
            int inter[] = tmp.get(i);
            if (inter[0] > T)
                break;
            if (inter[0] == 0) {
                for (int j = inter[0]; j <= inter[1] && j <= T; j++) {
                    arr[j] = 1;
                }
                continue;
            }
            if (arr[inter[0]] == Integer.MAX_VALUE)
                continue;
            int last = arr[inter[0]];
            for (int j = inter[0]; j <= inter[1] && j <= T; j++) {
                if (j == 0)
                    continue;
                arr[j] = Math.min(arr[j], 1 + last);
            }
        }
        return arr[T] == Integer.MAX_VALUE ? -1 : arr[T];
    }
}
