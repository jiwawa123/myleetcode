package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/3
    time 8:51 PM
*/

import java.util.*;

public class ReconstructQueue {
    public static void main(String[] args) {

    }
    public int[][] reconstructQueue(int[][] people) {
        if (0 == people.length || 0 == people[0].length)
            return new int[0][0];
        //按照身高降序 K升序排序
        /*
        先按照身高比较，然后比较个数
         */
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        //K值定义为 排在h前面且身高大于或等于h的人数
        //因为从身高降序开始插入，此时所有人身高都大于等于h
        //因此K值即为需要插入的位置
        for (int[] i : people) {
            list.add(i[1], i);
        }
        return list.toArray(new int[list.size()][]);
    }
}
