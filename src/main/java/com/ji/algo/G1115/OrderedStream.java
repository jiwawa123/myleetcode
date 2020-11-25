package com.ji.algo.G1115;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * user ji
 * data 2020/11/15
 * time 10:29 下午
 */
public class OrderedStream {
    public static void main(String[] args) {

    }

    int order;
    Map<Integer, String> map;
    int ptr = 1;

    public OrderedStream(int n) {
        this.order = n;
        map = new LinkedHashMap<>();
    }

    public List<String> insert(int id, String value) {
        map.put(id, value);
        List<String> res = new LinkedList<>();
        int tmp = ptr;
        while (id == ptr && map.containsKey(tmp)) {
            res.add(map.get(tmp++));
        }
        if (tmp > ptr)
            ptr = tmp;
        return res;
    }
}
