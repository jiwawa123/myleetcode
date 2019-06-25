package com.ji.new_algo;/*
    user ji
    data 2019/6/8
    time 10:10 AM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAbout {

    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, arr));
    }

    public static int compareVersion(String version1, String version2) {
        String s1[] = version1.split("\\.");
        String s2[] = version2.split("\\.");
        int i = 0;
        while (i < s1.length || i < s2.length) {
            int t1 = 0;
            int t2 = 0;
            if (i < s1.length) {
                t1 = Integer.valueOf(s1[i]);
            }
            if (i < s2.length) {
                t2 = Integer.valueOf(s2[i]);
            }
            if (t1 > t2)
                return 1;
            if (t1 < t2)
                return -1;
        }
        return 0;
    }

    public int maxArea(int[] height) {
        if (height == null || height.length < 2)
            return 0;
        int max = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            if (height[i] < height[j]) {
                max = Math.max((j - i) * height[i], max);
                i++;
            } else {
                max = Math.max((j - i) * height[j], max);
                j--;
            }
        }
        return max;
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            if (tmp > k)
                continue;
            if (tmp == k) {
                count++;
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                tmp += nums[j];
                if (tmp > k)
                    break;
                if (tmp == k) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        Arrays.fill(arr, -1);
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int med = i + (j - i) / 2;

        }
        return arr;

    }

    public static int minSubArrayLen(int s, int[] nums) {
        int len = Integer.MAX_VALUE;
        int tmp = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= s)
                return 1;
            sum += nums[i];
            tmp++;
            if (sum == s) {
                len = Math.min(len, tmp);
                continue;
            }
            if (sum > s) {
                int index = i - tmp + 1;
                while (sum > s) {
                    if (sum - nums[index] >= s)
                        sum -= nums[index++];
                    else
                        break;

                }
                tmp = i - index + 1;
                len = Math.min(len, tmp);
            }

        }
        return len;
    }

    public List<Integer> getRow(int rowIndex) {
        int i = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        while (i <= rowIndex) {
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    tmp.add(1);
                else
                    tmp.add(list.get(j - 1) + list.get(j));
            }
            i++;
            list = tmp;
        }
        return list;
    }
}
