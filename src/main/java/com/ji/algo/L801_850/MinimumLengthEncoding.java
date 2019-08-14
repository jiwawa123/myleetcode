package com.ji.algo.L801_850;/*
    user ji
    data 2019/8/14
    time 10:14 PM
*/

import java.util.*;

public class MinimumLengthEncoding {
    public static void main(String[] args) {
        String arr[] = {"time", "me", "bell"};
        System.out.println(minimumLengthEncoding(arr));
    }

    public static int minimumLengthEncoding(String[] words) {
        List<String> list = new ArrayList<>();
        for (String tmp : words
                ) {
            list.add(tmp);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i)))
                continue;
            count += list.get(i).length() + 1;
            String tmp = list.get(i);
            for (int j = 0; j < tmp.length(); j++) {
                if (map.containsKey(tmp.substring(j, tmp.length())))
                    break;
                map.put(tmp.substring(j, tmp.length()), 1);
            }
        }
        return count;
    }

}
