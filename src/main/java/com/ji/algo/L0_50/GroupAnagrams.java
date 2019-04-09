package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/9
    time 10:04 AM
*/

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {


    }
    //直接使用工具类找到最原始的字符串，然后进行相应的判断即可
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> re = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] tmp = strs[i].toCharArray();
            Arrays.sort(tmp);
            String all = String.valueOf(tmp);
            if(map.containsKey(all)){
                List<String> list = map.get(all);
                list.add(strs[i]);
                map.put(all,list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(all,list);
            }
        }
        for (List<String> tmp:map.values()
             ) {
            re.add(tmp);
        }
        return re;
    }
}
