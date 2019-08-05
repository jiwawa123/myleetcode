package com.ji.algo.L1101_1150;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
    user ji
    data 2019/8/5
    time 6:47 PM
*/
public class SnapshotArray {
    Map<Integer, Map<Integer, Integer>> map;
    int ind = 0;

    public SnapshotArray(int length) {
        map = new HashMap<>();
    }

    public void set(int index, int val) {
        Map<Integer,Integer> t = map.getOrDefault(index,new TreeMap<>());
        t.put(ind,val);
        map.put(index,t);
    }

    public int snap() {

        return ind++;
    }

    public int get(int index, int snap_id) {
        if (!map.containsKey(index))
            return 0;
        Map<Integer, Integer> t = map.get(index);
        while(snap_id>-1){//关键在这，因为在snap()生成新快照，没有为每个新生成的快照添加数据
            if (map.get(index).get(snap_id) != null) {
                return map.get(index).get(snap_id);
            }
            --snap_id;
        }
        return 0;
    }
}
