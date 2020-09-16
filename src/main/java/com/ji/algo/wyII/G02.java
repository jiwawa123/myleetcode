package com.ji.algo.wyII;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * user ji
 * data 2020/9/12
 * time 4:09 下午
 */
public class G02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        List<String[]> res = new LinkedList<>();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String tmp[] = sc.nextLine().split(" ");
            res.add(tmp);
        }
        List<String> last = new LinkedList<>();
        last.add("");
        for (int i = 0; i < m; i++) {
            List<String> next = new LinkedList<>();
            for (String str : last
            ) {
                for (String tmp : res.get(i)
                ) {
                    if (!str.equals("")) {
                        next.add(str + "-" + tmp);
                    } else {
                        next.add(str + tmp);
                    }
                }
            }
            last = next;
        }
        for (String str : last
        ) {
            System.out.println(str);
        }
    }
}
