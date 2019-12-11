package com.ji.algo.G1208;/*
    user ji
    data 2019/12/8
    time 10:45 AM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class G2 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            if(map.containsKey(size)){
                List<Integer> list = map.get(size);
                list.add(i);
                if(list.size()==size){
                    res.add(list);
                    map.remove(size);
                }else{
                    map.put(size,list);
                }
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                if(list.size()==size){
                    res.add(list);
                }else{
                    map.put(size,list);
                }
            }
        }
        return  res;
    }
}
