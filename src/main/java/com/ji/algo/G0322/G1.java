package com.ji.algo.G0322;

import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/3/22
 * time 10:29 AM
 */
public class G1 {
    public static void main(String[] args) {
        
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> tmp = new LinkedList<>();
        for (int i = 0; i < index.length; i++) {
            tmp.add(0);
        }
        for (int i = 0; i < index.length; i++) {
            tmp.set(index[i],nums[i]);
        }
        int res [] = new int[tmp.size()];
        for (int i = 0; i < index.length; i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }
}
