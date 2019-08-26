package com.ji.algo.L1151_1200;/*
    user ji
    data 2019/8/26
    time 9:23 AM
*/

import java.util.*;

public class InvalidTransactions {
    public static void main(String[] args) {
        String arr[] = {"alex,676,260,bangkok","bob,656,1366,bangkok",
                "alex,393,616,bangkok","bob,820,990,amsterdam","alex,596,1390,amsterdam"};
        invalidTransactions(arr);
    }

    public static List<String> invalidTransactions(String[] transactions) {
        Map<String, List<String>> map = new HashMap<>();
        for (String tmp : transactions
                ) {
            String inter[] = tmp.split(",");
            List<String> list = map.getOrDefault(inter[0], new ArrayList<>());
            list.add(tmp);
            map.put(inter[0], list);
        }
        Set<String> res = new HashSet<>();
        for (List<String> list : map.values()
                ) {
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String t1[] = o1.split(",");
                    String t2[] = o2.split(",");
                    return Integer.valueOf(t1[1]) - Integer.valueOf(t2[1]);
                }
            });
            for (int i = 0; i < list.size(); i++) {
                String t1[] = list.get(i).split(",");
                if (Integer.valueOf(t1[2]) > 1000)
                    res.add(list.get(i));
                for (int j = i + 1; j < list.size(); j++) {
                    String t2[] = list.get(j).split(",");
                    if (Integer.valueOf(t2[1]) > Integer.valueOf(t1[1]) + 60)
                        break;
                    if (!t1[3].equals(t2[3])) {
                        res.add(list.get(i));
                        res.add(list.get(j));
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}
