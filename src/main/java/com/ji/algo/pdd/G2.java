package com.ji.algo.pdd;

import java.util.*;

/**
 * user ji
 * data 2020/8/2
 * time 7:02 下午
 */
public class G2 {
    static Map<Set<String>, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][6];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        getRes(arr);
        System.out.println(map.size());
        List<Integer> list = new ArrayList<>();
        for (int t : map.values()
        ) {
            list.add(t);
        }
        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            if (i != 0) {
                System.out.print(" ");
            }
        }

    }


    public static void getRes(int arr[][]) {
        if (arr.length == 0)
            return;
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sp = new StringBuilder();
            for (int j = 0; j < 6; j++) {
                sp.append(arr[i][j]);
            }
            boolean flag = false;
            for (Set<String> tmp : map.keySet()
            ) {
                if (tmp.contains(sp.toString())) {
                    flag = true;
                    map.put(tmp, map.get(tmp) + 1);
                }
            }
            if (!flag) {
                Set<String> tmp = new HashSet<>();
                getAll(tmp, sp.toString());
                map.put(tmp, 1);
            }
        }
    }


    public static void getAll(Set<String> tmp, String t) {
        if (tmp.contains(t))
            return;
        tmp.add(t);
        char c1[] = t.toCharArray();
        c1[2] = t.charAt(5);
        c1[3] = t.charAt(4);
        c1[4] = t.charAt(2);
        c1[5] = t.charAt(3);
        getAll(tmp, String.valueOf(c1));

        char c2[] = t.toCharArray();
        c2[0] = t.charAt(5);
        c2[1] = t.charAt(4);
        c2[4] = t.charAt(0);
        c2[5] = t.charAt(1);
        getAll(tmp, String.valueOf(c2));

        char c3[] = t.toCharArray();
        c3[4] = t.charAt(3);
        c3[5] = t.charAt(2);
        c3[2] = t.charAt(4);
        c3[3] = t.charAt(5);
        getAll(tmp, String.valueOf(c3));


        char c4[] = t.toCharArray();
        c4[0] = t.charAt(4);
        c4[1] = t.charAt(5);
        c4[5] = t.charAt(1);
        c4[4] = t.charAt(0);
        getAll(tmp, String.valueOf(c4));

    }
}
