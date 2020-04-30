package com.ji.algo.L701_750;

import java.lang.reflect.Array;
import java.util.*;

/**
 * user ji
 * data 2020/4/29
 * time 8:44 上午
 */
public class SolutionII {
    public static void main(String[] args) {
        int arr[] = {0, 1};
        SolutionII solutionII = new SolutionII(4, arr);
        for (int i = 0; i < 3; i++) {
            System.out.println(solutionII.pick());
        }

    }

    TreeMap<Integer, Integer> map = new TreeMap<>();
    int real_size;

    public SolutionII(int N, int[] blacklist) {
        Arrays.sort(blacklist);
        if(blacklist.length==0||blacklist[0]!=0){

            map.put(0,0);
        }
        for (int i = 0; i < blacklist.length; i++) {
            if (i == blacklist.length - 1 || blacklist[i] + 1 != blacklist[i + 1]) {
                map.put(blacklist[i] - i, i + 1);//shift

            }

        }
        real_size = N - blacklist.length;
    }

    public int pick() {
        int n = (int) (Math.random() * real_size);
        int shift = map.get(map.floorKey(n));//<=

        return n + shift;
    }

}
