package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/7/24
    time 2:06 PM
*/

import java.util.*;

public class LargestValsFromLabels {
    public static void main(String[] args) {

    }

    static class Point {
        int value;
        int label;

        public Point(int value, int label) {
            this.value = value;
            this.label = label;
        }
    }

    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            Point p = new Point(values[i], labels[i]);
            points.add(p);
        }
        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o2.value - o1.value;
            }
        });
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int use = 0;
        for (int i = 0; i < points.size(); i++) {
            if (use >= num_wanted)
                break;
            if (map.getOrDefault(points.get(i).label, 0) > use_limit)
                continue;
            count += points.get(i).value;
            map.put(points.get(i).label, map.getOrDefault(points.get(i).label, 0) + 1);
            use++;
        }
        return count;
    }
}
