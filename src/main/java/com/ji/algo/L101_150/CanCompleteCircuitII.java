package com.ji.algo.L101_150;/*
    user ji
    data 2019/8/5
    time 1:17 PM
*/

public class CanCompleteCircuitII {
    public static void main(String[] args) {
        int gas[] = {1, 2, 3, 4, 5};
        int cost[] = {3, 4, 5, 1, 2};
        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int all = gas.length;
        for (int i = 0; i < gas.length; i++) {
            int start = i;
            int arr[] = new int[gas.length];
            int count = gas[i];
            while (count >= 0) {

                if (arr[start % all] > 0) {
                    return start;
                }
                arr[start % all] = 1;
                count -= cost[start % all];
                if(count<0)
                    break;
                start = (start + 1) % all;
                count += gas[start];
            }
        }

        return -1;
    }
}
