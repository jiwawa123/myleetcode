package com.ji.collectionUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * user ji
 * data 2020/7/2
 * time 2:22 下午
 */
public class CollectionsAbout {
    public static void main(String[] args) {
        Integer[] myArray = { 1, 2, 3 };
        List<Integer> list = Arrays.asList(myArray);
        System.out.println(Collections.binarySearch(list, 7));
        System.out.println(Collections.frequency(list, 2));
        list.add(1);
    }


}
