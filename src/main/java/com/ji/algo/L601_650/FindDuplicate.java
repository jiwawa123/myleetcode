package com.ji.algo.L601_650;/*
    user ji
    data 2019/7/24
    time 9:21 AM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicate {
    public static void main(String[] args) {

    }

    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths
                ) {
            String file[] = path.split(" ");
            for (int i = 1; i < file.length; i++) {
                String detail[] = file[i].split("\\(");
                String content = detail[1].substring(0, detail[1].length() - 1);
                String name = file[0]+"/"+detail[0];
                List<String> tmp = map.getOrDefault(content,new ArrayList<>());
                tmp.add(name);
                map.put(content,tmp);
            }
        }
        List<List<String>> list = new ArrayList<>();
        for (List<String> tmp : map.values()
                ) {
            if(tmp.size()>1)
                list.add(tmp);
        }
        return list;
    }
}
