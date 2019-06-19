package com.ji.algo.L601_650;/*
    user ji
    data 2019/6/19
    time 1:59 PM
*/

import java.util.*;

public class TriangleNumber {
    public static void main(String[] args) {
        int arr[] = {54,98,9,98,5,61,54,83};
        System.out.println(triangleNumber(arr));
    }

    public static int triangleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                continue;
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else {
                map.put(nums[i], 1);
                list.add(nums[i]);
            }
        }
        Collections.sort(list);
        int count = 0;
        //开始计算等边三角形
        for (int i = 0; i < list.size(); i++) {
            if (map.get(list.get(i)) > 2) {
                int tmp = map.get(list.get(i));
                count += tmp * (tmp - 1) * (tmp - 2) / 6;
            }
        }
        //开始计算等腰三角形
        for (int i = 0; i < list.size(); i++) {
            if (map.get(list.get(i)) < 2)
                continue;
            count += (map.get(list.get(i))) * (map.get(list.get(i)) - 1) * (i) / 2;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) >= list.get(i) * 2)
                    break;
                else
                    count += (map.get(list.get(i))) * (map.get(list.get(i)) - 1) * map.get(list.get(j)) / 2;
            }
        }
        //开始计算三个都不相等的
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    if (list.get(k) >= list.get(i) + list.get(j))
                        break;
                    count += (map.get(list.get(i))) * (map.get(list.get(j))) * (map.get(list.get(k)));
                }
            }
        }
        return count;
    }
}
