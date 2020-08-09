package com.ji.algo.G0808;

import java.io.*;
import java.util.Arrays;

/**
 * user ji
 * data 2020/8/8
 * time 11:40 下午
 */
public class G4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("/Users/ji/Desktop/k3.txt")));
        String tmp = null;
        while ((tmp = br.readLine()) != null) {
            long a = System.currentTimeMillis();
            System.out.println(tmp.length());
            System.out.println(longestAwesome(tmp));
            System.out.println(System.currentTimeMillis() - a);
        }
    }

    public static int longestAwesome(String s) {
        int[] pp = new int[s.length() + 1];
        int[] max = new int[1024];
        Arrays.fill(max, -1);
        int[] min = new int[1024];
        Arrays.fill(min, -1);
        min[0] = 0;
        for (int i = 0; i < s.length(); i++) {
            int p = pp[i + 1] = pp[i] ^ (1 << (s.charAt(i) - '0'));
            max[p] = i + 1;
            if (min[p] == -1) {
                min[p] = i + 1;
            }
        }
        int ans = 1;
        for (int i = 0; i < 1024; i++) {
            for (int j = 1; j < 1024; j <<= 1) {
                if (max[i] != -1 && min[j ^ i] != -1)
                    ans = Math.max(max[i] - min[j ^ i], ans);
                if (max[j ^ i] != -1 && min[i] != -1)
                    ans = Math.max(max[j ^ i] - min[i], ans);
            }
            if (max[i] != -1 && min[i] != -1)
                ans = Math.max(max[i] - min[i], ans);
        }
        return ans;
    }
}