package com.ji.algo.G1124;/*
    user ji
    data 2019/11/24
    time 10:29 AM
*/

import java.util.*;

public class G3 {
    public static void main(String[] args) {
        String arr[] = {"tmp"};
        (new G3().suggestedProducts(arr,"havana")).stream().forEach(System.out::println);
    }

    Map<Character, List<String>> map = new HashMap<>();
    List<String> tmp = new ArrayList<>();
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        for (String tmp : products
                ) {
            List<String> li = map.getOrDefault(tmp.charAt(0), new ArrayList<>());
            li.add(tmp);
            map.put(tmp.charAt(0),li);
        }
        if (searchWord == null || searchWord.length() == 0)
            return res;
        tmp = map.getOrDefault(searchWord.charAt(0), new ArrayList<>());
        for (int i = 0; i < searchWord.length(); i++) {
            helpSearch(tmp, searchWord.substring(0, i + 1));
        }
        return res;
    }

    public void helpSearch(List<String> list, String str) {
        List<String> inter = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith(str)) {
                inter.add(list.get(i));
            }
        }
        Collections.sort(inter);
        int j = 0;
        List<String> ll = new ArrayList<>();
        while (j < inter.size() && j < 3) {
            ll.add(inter.get(j++));
        }
        res.add(ll);
        tmp = inter;
    }
}
