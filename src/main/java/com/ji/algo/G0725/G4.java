package com.ji.algo.G0725;

import java.io.*;
import java.util.*;

/**
 * user ji
 * data 2020/7/25
 * time 10:17 下午
 */
public class G4 {

    public static void main(String[] args) throws IOException {
//        int arr[] = {3, 1, 5, 4, 2};
//        G4 g4 = new G4();
//        System.out.println(g4.minNumberOperations(arr));

        BufferedReader br = new BufferedReader(new FileReader(new File("/Users/ji/Desktop/data.txt")));
        String line = null;
        while ((line = br.readLine()) != null) {
            G4 g4 = new G4();
            int arr[] = new int[line.split(",").length];
            String[] str = line.split(",");
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.valueOf(str[i]);
            }
            System.out.println(arr.length);
            long a = System.currentTimeMillis();
            System.out.println(g4.minNumberOperations(arr));
            System.out.println(System.currentTimeMillis() - a);
        }

    }


    public int minNumberOperations(int[] target) {
        int res = target[0];
        for (int i = 1; i < target.length; i++) {
            if (target[i] - target[i - 1] > 0) {
                res = res + target[i] - target[i - 1];
            }
        }
        return res;

    }
}