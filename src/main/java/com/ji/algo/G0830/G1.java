package com.ji.algo.G0830;

/**
 * user ji
 * data 2020/8/30
 * time 10:28 上午
 */
public class G1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 1, 1, 1, 3};
        System.out.println(containsPattern(arr, 2, 3));
    }

    public static boolean containsPattern(int[] arr, int m, int k) {
        int len = arr.length;
        if (len < m * k)
            return false;
        int list[] = new int[m];
        for (int i = 0; i < len - m; i++) {
            for (int j = i; j < i + m; j++) {
                list[j - i] = arr[j];
            }
            int count = 1;
            boolean flag = true;
            for (int j = i + m; j < len; j += m) {
                int match = 0;
                for (int l = j; l < j + m && l < len; l++) {
                    if (list[l - j] != arr[l]) {
                        flag = false;
                        break;
                    }
                    match++;
                }
                if (!flag)
                    break;
                if (match == m)
                    count++;
                if (count >= k)
                    return true;
            }
        }

        return false;
    }
}
