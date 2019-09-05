package com.ji.algo.L201_250;/*
    user ji
    data 2019/9/5
    time 10:16 PM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupShiftedStrings {
    public static void main(String[] args) {

    }
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> list = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str: strings){
            String keyWord=shuffle(str);
            if(!map.containsKey(keyWord)) map.put(keyWord, new ArrayList<String>());
            map.get(keyWord).add(str);
        }

        for(String key: map.keySet()){
            list.add(map.get(key));
        }
        return list;
    }

    private String shuffle(String word){
        StringBuilder result= new StringBuilder();
        char bar= word.charAt(0);
        for(char ch: word.toCharArray()){
            int offset=(ch-bar)<0?(ch-bar+26):(ch-bar);
            result.append((char)(offset+'a'));
        }
        return result.toString();
    }
}
