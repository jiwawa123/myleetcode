package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 2:14 PM
*/

import com.ji.algo.Util.Interval;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        List<Interval> l= new ArrayList<>();
        l.add(new Interval(1,5));

        insert(l,new Interval(0,3));

    }
    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> list = new ArrayList<>();
        if(null==intervals||intervals.size()==0)
        {
            list.add(newInterval);
            return list;
        }
        int start = newInterval.start;
        int end = newInterval.end;
        for (int i = 0; i < intervals.size(); i++) {
            Interval tmp = intervals.get(i);
            if(tmp.start>end){
                list.add(new Interval(start,end));
                start = tmp.start;
                end = tmp.end;
                continue;
            }
            if(tmp.start==end){
                end = tmp.end;
                continue;
            }
            if(tmp.end<start){
                list.add(tmp);
                continue;
            }
            if(tmp.start<=start&&tmp.end>=end){
                start = tmp.start;
                end = tmp.end;
                continue;
            }
            if(tmp.start<=start&&tmp.end<=end){
                start = tmp.start;
                continue;
            }
            if(tmp.start>=start&&tmp.end>end){
                end = tmp.end;
                continue;
            }
        }
        list.add(new Interval(start,end));
        return list;
    }
}
