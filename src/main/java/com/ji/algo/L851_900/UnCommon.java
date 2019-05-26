package com.ji.algo.L851_900;/*
    user ji
    data 2019/5/26
    time 7:50 PM
*/

import java.util.*;

public class UnCommon {
    public static void main(String[] args) {

    }

    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        String tmp[] = A.split(" ");
        String tmp1[] = B.split(" ");
        for (int i = 0; i < tmp.length; i++) {
            map.put(tmp[i],map.getOrDefault(tmp[i],0)+1);
        }
        for (int i = 0; i < tmp1.length; i++) {
            map.put(tmp1[i],map.getOrDefault(tmp1[i],0)+1);
        }
        List<String> list = new LinkedList<>();
        for (String str:map.keySet()
             ) {
            if(map.get(str)==1)
                list.add(str);
        }
        return list.toArray(new String[list.size()]);
    }
}
