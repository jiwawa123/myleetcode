package com.ji.algo.G0719;

import java.util.*;

/**
 * user ji
 * data 2020/7/19
 * time 10:10 上午
 */
public class G3 {
    public static void main(String[] args) {

    }

    public List<String> maxNumOfSubstrings(String s) {
        int[][] arr = new int[26][2];
        List<String> res = new ArrayList<>();
        int n = s.length();
        for (int i = 0; i < 26; i++) {
            arr[i][0] = Integer.MAX_VALUE;
            arr[i][1] = Integer.MAX_VALUE;
        }
        //最后个出现s.charAt(i)的位置
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a'][1] = i;
        }
        //第一个出现s.charAt(i)的位置
        for (int i = n - 1; i >= 0; i--) {
            arr[s.charAt(i) - 'a'][0] = i;
        }

        //合并
        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'a');
            if (arr[i][0] == Integer.MAX_VALUE) continue;
            for (int j = arr[i][0]; j <= arr[i][1]; j++) {
                if (c != s.charAt(j) && (arr[s.charAt(j) - 'a'][0] < arr[i][0] || arr[s.charAt(j) - 'a'][1] > arr[i][1])) {
                    arr[i][0] = Math.min(arr[i][0], arr[s.charAt(j) - 'a'][0]);
                    arr[i][1] = Math.max(arr[i][1], arr[s.charAt(j) - 'a'][1]);
                    arr[s.charAt(j) - 'a'] = arr[i];
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 26; i++) {
            if (arr[i][0] == Integer.MAX_VALUE) continue;
            String str = s.substring(arr[i][0], arr[i][1] + 1);
            if (set.contains(str)) continue;
            list.add(Arrays.asList(arr[i][0], arr[i][1]));
            set.add(str);
        }

        //根据长度进行排序，从短的开始选
        Collections.sort(list, ((o1, o2) -> (o1.get(1) - o1.get(0)) - (o2.get(1) - o2.get(0))));
        List<List<Integer>> pick = new ArrayList<>();
        for (List<Integer> tmp : list) {
            boolean flag = true;
            for (List<Integer> tmp2 : pick) {
                if (tmp2.get(0) > tmp.get(0) && tmp2.get(1) < tmp.get(1)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                pick.add(tmp);
                res.add(s.substring(tmp.get(0), tmp.get(1) + 1));
            }
        }
        return res;
    }
}
