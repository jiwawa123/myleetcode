package com.ji.algo.G0628;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * user ji
 * data 2020/6/28
 * time 10:26 上午
 */
public class G1 {
    public static void main(String[] args) {

    }

    public boolean isPathCrossing(String path) {
        int r = 0, l = 0;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        set.add(0);
        map.put(0, set);
        for (char t : path.toCharArray()
        ) {
            switch (t) {
                case 'N':
                    r++;
                    if (map.containsKey(r) && map.get(r).contains(l))
                        return false;
                    Set set1 = map.getOrDefault(r, new HashSet<>());
                    set1.add(l);
                    map.put(r, set1);
                    break;
                case 'S':
                    r--;
                    if (map.containsKey(r) && map.get(r).contains(l))
                        return false;
                    Set set2 = map.getOrDefault(r, new HashSet<>());
                    set2.add(l);
                    map.put(r, set2);
                    break;
                case 'E':
                    l++;
                    if (map.containsKey(r) && map.get(r).contains(l))
                        return false;
                    Set set3 = map.getOrDefault(r, new HashSet<>());
                    set3.add(l);
                    map.put(r, set3);
                    break;
                case 'W':
                    l--;
                    if (map.containsKey(r) && map.get(r).contains(l))
                        return false;
                    Set set4 = map.getOrDefault(r, new HashSet<>());
                    set4.add(l);
                    map.put(r, set4);
                    break;
            }
        }

        return true;
    }
}
