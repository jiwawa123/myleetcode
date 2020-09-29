package com.ji.algo.G0926;

import java.util.*;
import java.util.stream.Collectors;

public class G5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        Map<String, Integer> map = new HashMap<>();
        while (!p.equals("organization")) {
            if (!p.contains(",")) {
                p = sc.nextLine();
                continue;
            }
            String arr[] = p.split(",");
            map.put(arr[0], Integer.valueOf(arr[1]));
            p = sc.nextLine();
        }
        Map<String, Set<String>> p1 = new HashMap<>();
        Map<String, Integer> p1c = new HashMap<>();

        Map<String, Set<String>> p2 = new HashMap<>();
        Map<String, Integer> p2c = new HashMap<>();
        p = sc.nextLine();
        while (!p.equals("eof")) {
            String arr[] = p.split(",");
            Set<String> inter1 = p1.getOrDefault(arr[0], new HashSet<>());
            inter1.add(arr[1]);
            p1.put(arr[0], inter1);
            Set<String> inter2 = p1.getOrDefault(arr[1], new HashSet<>());
            p1c.put(arr[0], p1c.getOrDefault(arr[0], 0) + map.get(arr[2]));
            inter2.add(arr[2]);
            p2.put(arr[1], inter2);
            p2c.put(arr[1], p2c.getOrDefault(arr[1], 0) + map.get(arr[2]));
            p = sc.nextLine();
        }

        Map<String, Integer> c1 = p1c.entrySet()
                .stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal, LinkedHashMap::new));
        for (Map.Entry<String, Integer> entry : c1.entrySet()
        ) {
            System.out.println(entry.getKey() + "<" + entry.getValue() + ">");
            Set<String> tmp = p1.get(entry.getKey());
            Set<String> sortSet = new TreeSet<String>(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return p2c.get(o2) - p2c.get(o1);
                }
            });
            sortSet.addAll(tmp);
            for (String next : sortSet
            ) {
                System.out.println("-" + next + "<" + p2c.get(next) + ">");
                Set<String> tt = p2.get(next);
                Set<String> sort = new TreeSet<String>(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return map.get(o2) - map.get(o1);
                    }
                });
                sort.addAll(tt);
                for (String last : sort
                ) {
                    System.out.println("--" + last + "<" + map.get(last) + ">");
                }
            }
        }
    }

}
