package com.ji.algo.L2301_2350;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/24/上午11:31
 */
public class L2342 {
    public static void main(String[] args) {
        L2342 l2342 = new L2342();
        int[] arr = {18, 43, 36, 13, 7};
        System.out.println(l2342.maximumSum(arr));
    }


    class MinAndMax {
        int sedMax;

        public void setSedMax(int sedMax) {
            this.sedMax = sedMax;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public void setC(int c) {
            this.c = c;
        }

        public MinAndMax() {
            this.sedMax = 0;
            this.max = 0;
        }

        int max;
        int c;
    }

    public int maximumSum(int[] nums) {
        int max = -1;
        Map<Integer, MinAndMax> map = new HashMap<>();
        for (int num : nums
        ) {
            int l = count(num);
            MinAndMax st = map.getOrDefault(l, new MinAndMax());
            st.c++;
            if (st.max <= num) {
                st.setSedMax(st.max);
                st.setMax(num);
            } else if (st.sedMax < num) {
                st.setSedMax(num);
            }

            map.put(l, st);
        }

        for (MinAndMax m : map.values()
        ) {
            if (m.c > 1) {
                max = Math.max(max, m.sedMax + m.max);
            }
        }
        return max;
    }

    public int count(int num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }
}

