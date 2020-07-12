package com.ji.algo.G0712;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/7/12
 * time 9:41 上午
 */
public class G01 {
    public static void main(String[] args) {
        System.out.println(reformatDate("20th Oct 2052"));
    }

    public static String reformatDate(String date) {
        String tmp[] = date.split(" ");
        String month[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < month.length; i++) {
            map.put(month[i], i + 1);
        }

        String year = tmp[2];
        String m = map.get(tmp[1]) < 10 ? "0" + map.get(tmp[1]) : "" + map.get(tmp[1]);
        String d = "";
        int count = 0;
        for (int i = 0; i < tmp[0].toCharArray().length; i++) {
            if (tmp[0].charAt(i) >= '0' && tmp[0].charAt(i) <= '9') {
                count = count * 10 + (tmp[0].charAt(i) - '0');
            } else {
                break;
            }
        }
        if (count < 10) {
            d = "0" + count;
        } else {
            d = "" + count;
        }

        return year + "-" + m + "-" + d;
    }
}
