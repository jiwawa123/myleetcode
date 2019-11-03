package com.ji.algo.game.G1103;/*
    user ji
    data 2019/11/3
    time 10:46 AM
*/

import java.util.HashMap;
import java.util.Map;

public class G2 {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1};
        System.out.println(numberOfSubarrays(arr, 2));
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        int sum = 0;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                index++;
                map.put(index, i);
            }
        }
        if (nums[nums.length - 1] % 2 == 0) {
            map.put(index + 1, nums.length);
        }
        if (index < k)
            return 0;
        for (int i = 1; i <= index; i++) {
            if (!map.containsKey(i + k - 1))
                break;
            int len = nums.length ;
            if (map.containsKey(i + k)) {
                len = map.get(i + k);
            }
            sum += (map.get(i) - map.get(i - 1)) * (len - map.get(i + k - 1));
        }
        return sum;
    }
}
