package com.ji.algo.L2251_2300;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/29/下午9:31
 */
public class L2284 {
    public static void main(String[] args) {
        String arr[] = {"b I j", "OK N x J jt b iO N Y", "Q h y CV UE Q A", "Qo Qy w Aw c", "oh", "OA kC G V GlX", "AD Z A YH Tyl", "MA", "sVD", "a BB o g o A hf H", "qu", "P nAx", "d e As Gd oD C RWb", "kS tI Lt U eq k M A", "cS e R h f gl", "AX dn b w nx", "nX T P B", "F", "Gk eGO", "l y Ue nC D", "o UV W P j p e Ov g", "aI Xr Fs NVz", "H f l", "B AY vs S", "rZ Ku S S pQ", "f N q cP lX o x", "W X X Za t", "Vp a xR X J G h A Vo"};
        String arr1[] = {"kXMEHbzSid", "LxSLj", "HvI", "rIffGg", "rIffGg", "RHiE", "HvI", "QWsD", "v", "QWsD", "VUCp", "vsp", "ArRIVvhn", "VUCp", "RHiE", "rIffGg", "FzxQzXec", "FzxQzXec", "VUCp", "VUCp", "vsp", "v", "rDkxpR", "rKsKmX", "rKsKmX", "HvI", "LxSLj", "grfeiaY"};
        System.out.println(largestWordCount(arr, arr1));

    }

    public static String largestWordCount(String[] messages, String[] senders) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < messages.length; i++) {
            map.put(senders[i], map.getOrDefault(senders[i], 0) + messages[i].split(" ").length);
        }
        String res = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                res = entry.getKey();

            } else if (entry.getValue() == max) {
                if (res.compareTo(entry.getKey()) < 0) {
                    res = entry.getKey();
                }
            }
        }
        return res;

    }
}
