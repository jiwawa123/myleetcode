package com.ji.algo.G0907;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/9/7
 * time 8:29 上午
 */
public class G2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 1};
        System.out.println(minCost("aabaa", arr));
    }

    public static int minCost(String s, int[] cost) {
        int res=0;
        for (int i = 0; i <s.length()-1 ; i++) {
            if (s.charAt(i)==s.charAt(i+1)){
//                我们把连续字符中最大的留下来就可以了
                res+=Math.min(cost[i],cost[i+1]);
//                把两个数中较大的移到后面,方便比较
                if (cost[i]>cost[i+1]){
                    cost[i+1]=cost[i];
                }
            }
        }
        return res;
    }
}
