package com.ji.algo.LCP;

import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/10/16:46
 */
public class LO100 {
    public static void main(String[] args) {

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (i > 0) {
                    if (j == 0) {

                        int k = triangle.get(i - 1).get(0) + triangle.get(i).get(0);
                        triangle.get(i).set(0, k);

                    } else if (j == triangle.get(i).size() - 1) {

                        int k = triangle.get(i - 1).get(j) + triangle.get(i).get(j - 1);
                        triangle.get(i).set(j, k);
                    } else {

                        int k = Math.max(triangle.get(i - 1).get(j), triangle.get(i - 1).get(j - 1)) + triangle.get(i).get(j - 1);
                        triangle.get(i).set(j, k);
                    }
                }
                res = Math.max(res, triangle.get(i).get(j));
                System.out.println(res);
            }
        }
        return res;
    }
}
