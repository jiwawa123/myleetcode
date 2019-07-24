package com.ji.algo.L951_1000;/*
    user ji
    data 2019/7/24
    time 11:15 AM
*/

import com.ji.algo.Util.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

public class VerticalTraversal {
    public static void main(String[] args) {

    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)
            return list;
        Map<Integer, Map<Integer, List<Integer>>> map = new HashMap<>();
        List<Integer> f = new ArrayList<>();
        Map<Integer, List<Integer>> li = new HashMap<>();
        f.add(root.value);
        li.put(0, f);
        map.put(0, li);
        help(root.left, -1, 0, 0, map);
        help(root.right, 1, 0, 0, map);
        Map<Integer, Map<Integer, List<Integer>>> result = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        for (Map<Integer, List<Integer>> tmp : result.values()
                ) {
            List<Integer> lll = new ArrayList<>();
            Map<Integer, List<Integer>> local = tmp.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, LinkedHashMap::new));

            for (List<Integer> l : local.values()
                    ) {
                Collections.sort(l);
                for (int t : l
                        ) {
                    lll.add(t);
                }
            }
            list.add(lll);
        }
        return list;
    }

    public void help(TreeNode root, int direction, int index, int dep, Map<Integer, Map<Integer, List<Integer>>> map) {
        if (root == null)
            return;
        if (direction == -1) {
            Map<Integer, List<Integer>> tmp = map.getOrDefault(index - 1, new HashMap<>());
            List<Integer> l = tmp.getOrDefault(dep, new LinkedList<>());
            l.add(root.value);
            tmp.put(dep, l);
            map.put(index - 1, tmp);
            help(root.left, -1, index - 1, dep + 1, map);
            help(root.right, 1, index - 1, dep + 1, map);
        } else {
            Map<Integer, List<Integer>> tmp = map.getOrDefault(index + 1, new HashMap<>());
            List<Integer> l = tmp.getOrDefault(dep, new LinkedList<>());
            l.add(root.value);
            tmp.put(dep, l);
            map.put(index + 1, tmp);
            help(root.left, -1, index + 1, dep + 1, map);
            help(root.right, 1, index + 1, dep + 1, map);
        }
    }
}
