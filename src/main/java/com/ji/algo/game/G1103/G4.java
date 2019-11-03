package com.ji.algo.game.G1103;/*
    user ji
    data 2019/11/3
    time 12:14 PM
*/

import java.util.ArrayList;
import java.util.List;

public class G4 {
    public static void main(String[] args) {
        int arr[] = {3,6};
        System.out.println(isGoodArray(arr));
    }

    public static boolean isGoodArray(int[] nums) {
        if (nums.length == 1 && nums[0] != 1) {
            return false;
        }
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (!l1.isEmpty())
                    return true;
                if (l2.isEmpty())
                    l2.add(2);
            } else {
                if (!l2.isEmpty())
                    return true;
                if (l1.isEmpty()) {
                    l1.add(nums[i]);
                    continue;
                }

                for (int j = 0; j < l1.size(); j++) {
                    int tmp = l1.get(j);
                    if (tmp % nums[i] == 0) {
                        l1.remove(j);
                        l1.add(nums[i]);
                        break;
                    }
                    if (nums[i] % tmp == 0)
                        continue;
                    return true;
                }
            }
        }
        return false;
    }
}
