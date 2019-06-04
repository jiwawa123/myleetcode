package com.ji.algo.L501_550;/*
    user ji
    data 2019/6/4
    time 9:13 PM
*/

import java.util.HashMap;
import java.util.Map;

public class FindMaxLength {
    public static void main(String[] args) {

    }

    public int findMaxLength(int[] nums) {
        int res = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                nums[i] = -1;
        }
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 0 && i > res) {
                res = i + 1;
            }
            if(map.containsKey(sum)){
                res = Math.max(i-map.get(sum),res);
            }else{
                map.put(sum,i);
            }
        }
        return res;
    }
}

