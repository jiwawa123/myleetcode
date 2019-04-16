package com.ji.algo.L151_200;/*
    user ji
    data 2019/4/16
    time 8:21 PM
*/

import java.util.*;

public class LargeNumber {
    public static void main(String[] args) {
        int arr[] = {121, 12};
        System.out.println(new LargeNumber().largestNumber(arr));
    }

    public String largestNumber(int[] nums) {
        if (null == nums || nums.length == 0)
            return "0";
        if (nums.length == 1)
            return "" + nums[0];
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add("" + nums[i]);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return compareString(o1, o2);
            }
        });
        StringBuffer sp = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            sp.append(list.get(i));
        }
        if(sp.charAt(0)=='0')
            return 0+"";
        return sp.toString();
    }

    public int compareString(String o1, String o2) {
        long tmp1 = Long.valueOf(o1 + o2);
        long tmp2 = Long.valueOf(o2 + o1);
        return (int)(tmp2 - tmp1);
    }
}
