package com.ji.paper;

import java.io.*;

/**
 * user ji
 * data 2020/9/28
 * time 4:15 下午
 */
public class DealData {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/ji/Documents/data/dataset1/ws_distance_kernal.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String tmp = null;
        int array[] = new int[100];
        int index = 0;
        while ((tmp = br.readLine()) != null) {
            index++;
            String arr[] = tmp.split(",");
            float f = Float.valueOf(arr[2]);
            if (f > 10)
                continue;
            array[(int) (f * 10)]++;
        }

        System.out.println(index);
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
            System.out.println(i + "\t" + (array[i] * 1.0) / index);
        }
    }
}
