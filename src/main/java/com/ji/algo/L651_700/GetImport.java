package com.ji.algo.L651_700;/*
    user ji
    data 2019/5/30
    time 9:31 PM
*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetImport {
    public static void main(String[] args) {

    }

    int count = 0;

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (int i = 0; i < employees.size(); i++) {
            map.put(employees.get(i).id, employees.get(i));
        }
        if (!map.containsKey(id))
            return 0;
        count += map.get(id).importance;
        help(map.get(id).subordinates, map);
        return count;
    }

    public void help(List<Integer> employees, Map<Integer, Employee> map) {
        if (employees.size() == 0)
            return;
        for (int k : employees
                ) {
            count += map.get(k).importance;
            help(map.get(k).subordinates,map);
        }
    }
}
