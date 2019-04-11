package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/11
    time 8:34 AM
*/

import java.util.ArrayList;
import java.util.List;

public class CombineSumII {
    public static void main(String[] args) {

    }

    List<List<Integer>> list = new ArrayList();

    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        if(target==0||null==arr||arr.length==0)
            return list;
        List<Integer> tmp = new ArrayList<>();
        help(tmp,target,0,arr);
        return list;
    }

    public void help(List<Integer> tmp, int target, int start, int[] arr) {
        if (target == 0) {
            list.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (arr[i] > target) {
                break;
            }
            tmp.add(arr[i]);
            help(tmp, target - arr[i], i + 1, arr);
            tmp.remove(tmp.size() - 1);
        }
    }
}
