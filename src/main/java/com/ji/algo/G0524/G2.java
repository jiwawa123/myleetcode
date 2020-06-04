package com.ji.algo.G0524;


import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * user ji
 * data 2020/5/24
 * time 10:33 上午
 */
public class G2 {
    public static void main(String[] args) throws IOException {

//        FileInputStream fi = new FileInputStream("/Users/ji/Desktop/t5");
//        BufferedReader br = new BufferedReader(new InputStreamReader(fi));
//        String line = null;
//        StringBuilder sp = new StringBuilder();
//        while ((line = br.readLine()) != null) {
//            sp.append(line);
//        }

        long a = System.currentTimeMillis();
        System.out.println(maxVowels("ohisvo", 6));
        System.out.println(System.currentTimeMillis() - a);
    }

    public static int maxVowels(String s, int k) {
        if (k == 0 || s == null || s.length() == 0)
            return 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('e', 1);
        map.put('i', 1);
        map.put('o', 1);
        map.put('u', 1);
        int res = 0;
        char tmp[] = s.toCharArray();
        List<Integer> index = new LinkedList<>();
        // 双指针即可
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(tmp[i])) { //判断长度
                if (index.isEmpty()) {
                    index.add(i);
                } else {
                    int f = index.get(0);
                    if (i - f + 1 > k) {
                        index.remove(0);
                    }
                    index.add(i);
                }


            }
            res = Math.max(res, index.size());
            if (res == k)
                return k;
        }

        return res;
    }


}
