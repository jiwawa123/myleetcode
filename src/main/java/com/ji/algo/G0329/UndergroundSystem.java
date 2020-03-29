package com.ji.algo.G0329;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/3/29
 * time 12:13 PM
 */
public class UndergroundSystem {
    public UndergroundSystem() {

    }

    //分别用来计算次数与总的花费时间
    Map<String, Map<String, Integer>> carCount = new HashMap<>();
    Map<String, Map<String, Integer>> carCost = new HashMap<>();
    Map<Integer, Map<String, Integer>> user = new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        Map<String, Integer> map = new HashMap<>();
        map.put(stationName, t);
        user.put(id, map);
    }

    public void checkOut(int id, String stationName, int t) {
        //找到上车的地方
        Map<String, Integer> map = user.get(id);
        String start = "";
        int startT = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()
                ) {
            start = entry.getKey();
            startT = entry.getValue();
        }
        Map<String, Integer> stationCount = carCount.getOrDefault(start, new HashMap<>());
        Map<String, Integer> stationCost = carCost.getOrDefault(start, new HashMap<>());
        stationCount.put(stationName, stationCount.getOrDefault(stationName, 0) + 1);
        stationCost.put(stationName, stationCost.getOrDefault(stationName, 0) + t - startT);
        carCount.put(start,stationCount);
        carCost.put(start,stationCost);

    }

    public double getAverageTime(String startStation, String endStation) {
        if (!carCount.containsKey(startStation) || !carCount.get(startStation).containsKey(endStation))
            return 0.0;
        return carCost.get(startStation).get(endStation) * 1.0 /
                carCount.get(startStation).get(endStation);
    }
}
