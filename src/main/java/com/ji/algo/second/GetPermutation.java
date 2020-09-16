package com.ji.algo.second;

/**
 * user ji
 * data 2020/9/5
 * time 8:49 上午
 */
public class GetPermutation {
    public static void main(String[] args) {
        System.out.println(getPermutation(3, 2));
    }

    public static String getPermutation(int n, int k) {
        int count = 1;
        for (int i = 1; i <= n - 1; i++) {
            count *= i;
        }
        boolean flag[] = new boolean[n + 1];
        flag[0] = true;

        int tmp = k / count;
        if (tmp * count < k) {
            tmp += 1;
            flag[tmp] = true;
            return getPermutation(n, k - (tmp - 1) * count, flag, "" + (tmp), n - 1);
        }
        flag[tmp] = true;
        return getPermutation(n, k - tmp * count, flag, "" + (tmp), n - 1);
    }


    public static String getPermutation(int n, int k, boolean arr[], String str, int last) {
        if (last == 0)
            return str;
        int count = 1;
        for (int i = 1; i <= last - 1; i++) {
            count *= i;
        }
        int tmp = (int) Math.floor(k * 1.0 / count);
        int len = 0;
        if (tmp * count < k) {
            len = tmp;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                if (len == 0) {
                    arr[i] = true;
                    str += i;
                    break;
                }
                len--;
            }
        }
        return getPermutation(n, k - (tmp - 1) * count, arr, str, last - 1);
    }
}
