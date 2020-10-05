package com.ji.algo.G1004;

import java.util.*;

/**
 * user ji
 * data 2020/10/4
 * time 9:33 上午
 */
public class G1 {
    public static void main(String[] args) {
        String names[] = {"A", "A", "A", "A"};
        String times[] = {"10:00", "00:00", "10:40", "11:00"};
        System.out.println(new G1().alertNames(names, times));
    }

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Set<String> res = new HashSet<>();
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < keyName.length; i++) {
            if (res.contains(keyName[i]))
                continue;
            String tmp[] = keyTime[i].split(":");
            int hour = Integer.valueOf(tmp[0]);
            int minute = Integer.valueOf(tmp[1]);
            int last = hour * 60 + minute;
            List<Integer> li = map.getOrDefault(keyName[i], new LinkedList<>());
            li.add(last);
            map.put(keyName[i], li);
        }
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()
        ) {
            if (isMatch(entry.getValue())) {
                res.add(entry.getKey());
            }
        }
        List<String> list = new LinkedList<>(res);
        Collections.sort(list);
        return list;
    }

    public boolean isMatch(List<Integer> list) {
//        Collections.sort(list);
        int index = 0;
        for (int i = 2; i < list.size(); i++) {
            if (list.get(i) - list.get(index++) <= 60) {
                return true;
            }
        }
        return false;
    }
}

