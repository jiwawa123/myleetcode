package com.ji.algo.game;/*
    user ji
    data 2019/10/20
    time 10:54 AM
*/

import java.util.*;

public class RemoveSubfolders {
    public static void main(String[] args) {

    }

    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < folder.length; i++) {
            if (map.isEmpty()) {
                map.put(folder[i], 1);
                continue;
            } else {
                boolean flag = true;
                for (String tmp : map.keySet()
                        ) {
                    if (folder[i].startsWith(tmp+"/")) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    map.put(folder[i], 1);
                }
            }
        }
        List<String> res= new ArrayList<>();
        for (String tmp: map.keySet()
             ) {
            res.add(tmp);
        }
        return  res;
    }
}
