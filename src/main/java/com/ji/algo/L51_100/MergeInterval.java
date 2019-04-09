package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 11:18 AM
*/

import com.ji.algo.Util.Interval;

import java.util.*;
import java.util.stream.Collectors;

public class MergeInterval {
    public static void main(String[] args) {
        List<Interval> l = new ArrayList<>();
        l.add(new Interval(1,4));
        l.add(new Interval(0,4));
        List<Interval> tmp = l.stream().sorted((o1, o2) -> {
            if(o1.start!=o2.start)
                return o1.start - o2.start;
            return o1.end - o2.end;
        }).collect(Collectors.toList());
        tmp.stream().forEach(System.out::println);
    }

    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> answer = new ArrayList<>();
        if (null == intervals || intervals.size() == 0)
            return answer;
        //使用流对其进行排序
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start!=o2.start)
                    return o1.start - o2.start;
                return o1.end - o2.end;
            }
        });

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (int i = 1; i < intervals.size(); i++) {
            Interval tmp = intervals.get(i);
            if (start == tmp.start && end == tmp.end)
                continue;
            if (start == tmp.start && end <= tmp.end) {
                end = tmp.end;
                continue;
            }

            if (end < tmp.start) {
                answer.add(new Interval(start, end));
                start = tmp.start;
                end = tmp.end;
                continue;
            }
            if(start<tmp.start&&end<tmp.end){
                end = tmp.end;
            }

        }
        answer.add(new Interval(start, end));
        return answer;

    }
}
