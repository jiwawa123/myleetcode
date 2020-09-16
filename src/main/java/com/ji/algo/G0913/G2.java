package com.ji.algo.G0913;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * user ji
 * data 2020/9/13
 * time 3:15 下午
 */
public class G2 {
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] pair : pairs) {
            map.put(pair[0], pair[1]);
            map.put(pair[1], pair[0]);
        }
        Set<Integer> un_happy = new HashSet<>();
        for (int x = 0; x < n; ++x) { // 对每一个 x
            int y = map.get(x);  // 找它的配对y
            int y_Index = getIndex(preferences[x], y); //找到x的朋友列表中y的位置 熟悉度排名
            for (int i = 0; i < y_Index; ++i) {
                int u = preferences[x][i];        //对每一个x的朋友u (比y还熟的朋友)
                int v = map.get((Integer)u);      //查看u的匹配v
                if (getIndex(preferences[u], x) < getIndex(preferences[u], v)){ //如果u和x更熟  那么x就不开心了
                    un_happy.add(x);
                }
            }
        }
        return un_happy.size();
    }
    public int getIndex(int[] preference, int who) {
        for (int i = 0; i < preference.length; ++i) {
            if (who == preference[i]) {
                return i;
            }
        }
        return -1;
    }
}
