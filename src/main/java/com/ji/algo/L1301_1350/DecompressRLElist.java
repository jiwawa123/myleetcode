package com.ji.algo.L1301_1350;/*
    user ji
    data 2020/1/30
    time 11:54 AM
*/

import java.util.ArrayList;
import java.util.List;

public class DecompressRLElist {
    public static void main(String[] args) {

    }
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < nums.length; i+=2) {
            int len = nums[i];
            while(len>0){
                list.add(nums[i+1]);
                len--;
            }
        }
        int res[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
