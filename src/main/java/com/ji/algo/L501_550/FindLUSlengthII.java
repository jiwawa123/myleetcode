package com.ji.algo.L501_550;/*
    user ji
    data 2019/8/22
    time 6:54 PM
*/

import java.util.*;

public class FindLUSlengthII {
    public static void main(String[] args) {
        String arr[] = {"aaa", "aaa", "aa"};
        //System.out.println(match("aaa", "aa"));
        System.out.println(findLUSlength(arr));
    }

    public static int findLUSlength(String[] strs) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            list.add(strs[i]);
            map.put(strs[i], map.getOrDefault(strs[i], 0) + 1);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        for (int i = 0; i < list.size(); i++) {
            String tmp = list.get(i);
            if (map.get(tmp) == 1) {
                boolean flag = true;
                for (int j = i - 1; j >= 0; j--) {
                    if (j > 0 && list.get(j) == list.get(j - 1))
                        continue;
                    if (match(list.get(j), list.get(i))) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    return tmp.length();
            }

        }
        return -1;
    }

    public static boolean match(String t, String s) {
        if (s == null && t == null)
            return true;
        if (s.equals(""))
            return true;
        if (s.length() > t.length())
            return false;
        int i = 0;
        while (i < s.length()) {
            int index = t.indexOf(s.charAt(i));
            if (index == -1)
                return false;
            t = t.substring(index + 1, t.length());
            i++;
        }
        return true;
    }
}
