package com.ji.algo.L2551_2600;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/01/10:09
 */
public class L2593 {
    public static void main(String[] args) {
        int[] arr = {10, 44, 10, 8, 48, 30, 17, 38, 41, 27, 16, 33, 45, 45, 34, 30, 22, 3, 42, 42};
        System.out.println(findScore(arr));
    }

    public static long findScore(int[] nums) {
        int n = nums.length;
        PriorityQueue<int[]> priQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                else return o1[0] - o2[0];
            }
        });
        for(int i=0;i<n;i++){
            priQueue.offer(new int[]{nums[i],i});
        }
        boolean[] marked = new boolean[n];
        long score = 0;
        while(!priQueue.isEmpty()) {
            int[] temp = priQueue.poll();
            while(!priQueue.isEmpty() && marked[temp[1]] == true) {
                temp = priQueue.poll();
            }
            if(marked[temp[1]] == false) {//未标记的最小值
                score += temp[0];
                marked[temp[1]] = true;
                if(temp[1]-1 >= 0) marked[temp[1]-1] = true;
                if(temp[1]+1 < n) marked[temp[1]+1] = true;
            }
        }
        return score;
    }
}
