package com.ji.algo.L301_350;/*
    user ji
    data 2019/4/24
    time 8:15 PM
*/

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int a[] ={4,7,9,7,6,7};
        int b[] = {5,0,0,6,1,6,2,2,4};
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1==null||nums2==null||nums1.length==0||nums2.length==0)
            return null;
        Set<Integer> list = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
            }
        }
        List<Integer> tmp = new ArrayList<>(list);
        int arr[] = new int[tmp.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tmp.get(i);
        }
        return arr;
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> tmp = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i],map.getOrDefault(nums2[i],0));
        }
        for (int i = 0; i < nums1.length; i++) {
            if(map.containsKey(nums1[i])){
                if(map.get(nums1[i])==1){
                    tmp.add(nums1[i]);
                    map.remove(nums1[i]);
                }else{
                    tmp.add(nums1[i]);
                    map.put(nums1[i],map.get(nums1[i])-1);
                }
            }
        }
        int arr[] = new int[tmp.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tmp.get(i);
        }
        return arr;
    }
}
