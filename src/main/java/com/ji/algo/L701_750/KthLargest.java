package com.ji.algo.L701_750;/*
    user ji
    data 2019/5/26
    time 8:57 PM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthLargest {

    List<Integer> list = new ArrayList<>();
    int tmp;
    int len ;
    //初始化的时候进行相应排序
    public KthLargest(int k, int[] nums) {
        len  = k;
        Arrays.sort(nums);
        if(nums.length<=k){
            for (int i = 0; i < nums.length ; i++) {
                list.add(nums[i]);
            }
        }else{
            int index = nums.length - k;
            for (int i = index; i < nums.length && i >= 0; i++) {
                list.add(nums[i]);
            }
        }

        if (list.size() > 0)
            tmp = list.get(0);
    }

    public int add(int val) {
        if (list.size() < len) {
            int index = insert_index(val);
            list.add(index, val);
            tmp = list.get(0);
            return tmp;
        }
        if (val <= tmp) {
            return tmp;
        } else {
            int index = insert_index(val);
            list.add(index, val);
            list.remove(0);
            tmp = list.get(0);
            return tmp;

        }
    }

    public int insert_index(int val) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            int med = i + (j - i) / 2;
            if (list.get(med) == val)
                return med;
            if (list.get(med) < val) {
                i = med + 1;
            } else {
                j = med - 1;
            }
        }
        if(list.size()>0)
            if (list.get(i) < val)
                return i + 1;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {0};
        KthLargest largest = new KthLargest(2, arr);
        System.out.println(largest.add(-1));
        System.out.println(largest.add(1));
        System.out.println(largest.add(-2));
        System.out.println(largest.add(-4));
        System.out.println(largest.add(3));
    }
}
