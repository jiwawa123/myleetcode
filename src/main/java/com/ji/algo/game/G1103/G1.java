package com.ji.algo.game.G1103;/*
    user ji
    data 2019/11/3
    time 10:31 AM
*/

public class G1 {
    public static void main(String[] args) {
        System.out.println(minimumSwap("xxyyxyxyxx", "xyyxyxxxyx"));
    }

    public static int minimumSwap(String s1, String s2) {
        int arr[] = {0, 0};
        int arr1[] = {0, 0};
        int count = 0;
        int c1 = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'x')
                arr[0]++;
            else
                arr[1]++;
            if (s2.charAt(i) == 'x')
                arr1[0]++;
            else
                arr1[1]++;
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (s1.charAt(i) == 'x')
                    c1++;
            }

        }

        if ((arr[0] + arr1[0]) % 2 != 0 || (arr[1] + arr1[1]) % 2 != 0)
            return -1;
        return c1 / 2 + (count - c1) / 2 + count - (c1 / 2 + (count - c1) / 2) * 2;
    }
}
