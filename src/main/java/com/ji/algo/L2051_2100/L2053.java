package com.ji.algo.L2051_2100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ji
 * @data 2021/12/7
 * @time 10:39 下午
 */
public class L2053 {
    public static void main(String[] args) {

    }
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map =new HashMap<>();
        for (String s:arr
             ) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int count = 0;
        for (String s:arr
             ) {
            if(map.get(s)==1)
                count++;
            if(k==count)
                return s;
        }
        return "";
    }
}
