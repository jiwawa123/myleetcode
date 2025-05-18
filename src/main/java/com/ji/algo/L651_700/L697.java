package com.ji.algo.L651_700;/*
    user ji
    data 2019/9/28
    time 3:28 PM
*/



import java.util.HashMap;
import java.util.Map;

public class L697 {
    static class Point {
        int start;
        int end;
        int count;
    }

    //使用两个map即可，一个用来统计这个数字出现的次数，一个用来计算这个出现的start和end
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Point> map = new HashMap<>();
        int degree = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).count++;
                map.get(nums[i]).end = i;
            } else {
                map.put(nums[i], new Point());
                map.get(nums[i]).count++;
                map.get(nums[i]).start = i;
                map.get(nums[i]).end = i;
            }
            degree = Math.max(degree, map.get(nums[i]).count);
        }
        int res = Integer.MAX_VALUE;
        for (Point p : map.values()) {
            if (p.count == degree) {
                res = Math.min(res, p.end - p.start + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 2, 1, 3, 3};
        System.out.println(findShortestSubArray(arr));
    }
}
