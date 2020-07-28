package com.ji.algo.G0726;

/**
 * user ji
 * data 2020/7/26
 * time 10:16 上午
 */
public class G1 {
    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 2, 0};
        System.out.println(restoreString("aiohn", arr));
    }

    public static String restoreString(String s, int[] indices) {
        if (s == null || s.length() == 0)
            return s;
        char[] tmp = s.toCharArray();
        char[] res = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = tmp[i];
        }
        return String.valueOf(res);
    }
}
