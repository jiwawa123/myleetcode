package com.ji.algo.dd;

import java.util.*;

/**
 * user ji
 * data 2020/8/21
 * time 7:32 下午
 */
public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 100 || n >= 2000) {
            System.out.println(0);
            return;
        }
        List<int[]> res = new LinkedList<>();
        for (int i = 100; i < 999; i++) {
            if (n < i)
                break;
            if (n - i < 100)
                break;
            if (isMatch(i, n - i)) {
                int tmp[] = {i, n - i};
                res.add(tmp);
            }
        }
        System.out.println(res.size());
        Collections.sort(res, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int t[] : res
        ) {
            System.out.println(t[0] + " " + t[1]);
        }
    }

    public static boolean isMatch(int a, int b) {
        if (a < 100 || b < 100)
            return false;
        char ta[] = (a + "").toCharArray();
        if (ta[0] == '0')
            return false;
        char tb[] = (b + "").toCharArray();
        if (ta[0] == ta[1] || ta[1] == ta[2])
            return false;
        if (tb[0] != tb[1] && tb[1] == tb[2] && ta[0] == tb[0] && ta[2] == tb[2] && ta[1] != tb[1])
            return true;
        return false;
    }


}
