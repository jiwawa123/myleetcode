package com.ji.algo.L751_800;/*
    user ji
    data 2019/7/30
    time 7:19 PM
*/

import java.util.*;

public class PyramidTransitionII {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        List<String> list = Arrays.asList("EED", "BGG", "AGF", "AGD", "AGA", "CCE", "DCG",
                "DCD", "DCB", "DCA", "FGD", "FGE", "FGG", "FGA", "FGC", "BFB", "BFG", "BFD", "FAB",
                "GAF", "EDD", "DBC", "EDE", "DBE", "DBD", "FAG", "FFG", "FFF", "FFE", "FFD", "FFC",
                "FFA", "FDA", "GCA", "GBD", "FDB", "GBB", "BEB", "BEF", "BEG", "BED", "AEA", "GCB",
                "AED", "AEG", "AEF", "DEA", "EEA", "DEE", "DEF", "EEB", "CEG", "CEC", "GEC", "GEB",
                "GEG", "GED", "BDE", "BDG", "BDF", "GCE", "AFE", "AFG", "AFA", "AFB", "EFA", "DDA",
                "EFD", "DDF", "EFF", "EFG", "CBB", "CBF", "CBD", "BDA", "ACC", "ACB", "ACA", "ACE",
                "BCE", "BCF", "BCG", "DGF", "ECG", "DGC", "ECE", "ECC", "DGD", "CGA", "CGC", "CGE",
                "FCB", "FCD", "DDE", "FCF", "GGB", "FED", "FEB", "BBC", "BBA", "ADF", "ADE", "ADB",
                "ADA", "DFD", "DFA", "DFC", "CDD", "CDE", "CDB", "CDC", "FBC", "GDB", "GDC", "FBG",
                "GDE", "AAE", "AAD", "AAG", "AAA", "AAC", "BAF", "BAG", "BAB", "BAA", "CAC", "CAB",
                "CAE", "CAD", "DAF", "DAB", "DAC", "EAC", "EAF", "GAG", "FAC", "FAF", "GAB",
                "ABB", "ABD", "ABE", "ABF", "ABG", "GCC", "EBD", "EBE", "EBF", "CFF", "CFE", "CFB",
                "GFA", "GFF", "GFG");
        String tt = "BDAFFFDB";
        System.out.println(new PyramidTransitionII().pyramidTransition(tt, list));
        System.out.println(System.currentTimeMillis() - a);
    }

    Map<String, Set<Character>> map = new HashMap<>();
    boolean flag = false;

    public boolean pyramidTransition(String bottom, List<String> allowed) {
        for (int i = 0; i < allowed.size(); i++) {
            String tmp = allowed.get(i);
            Set<Character> res = map.getOrDefault(tmp.substring(0, 2), new HashSet<>());
            res.add(tmp.charAt(2));
            map.put(tmp.substring(0, 2), res);
        }
        Set<String> tmp = new HashSet<>();
        tmp.add(bottom);
        help(tmp);
        return flag;

    }

    public void help(Set<String> str) {
        if (str.size() == 0)
            return;
        if (flag)
            return;
        for (String string : str
                ) {
            if (string.length() == 1) {
                flag = true;
                return;
            }
            Set<String> tmp = new HashSet<>();
            tmp.add("");
            boolean ff = true;
            for (int i = 0; i < string.length() - 1; i++) {
                if (!map.containsKey(string.substring(i, i + 2))) {
                    ff = false;
                    break;
                }
            }
            if (!ff)
                continue;
            for (int i = 0; i < string.length() - 1; i++) {
                if (map.containsKey(string.substring(i, i + 2))) {
                    Set<Character> result = map.get(string.substring(i, i + 2));
                    Set<String> tt = new HashSet<>();
                    for (String b : tmp) {
                        for (char c : result
                                ) {
                            tt.add(b + c);
                        }
                    }
                    tmp = tt;
                } else {
                    ff = false;
                    break;
                }
            }
            if (ff) {
                help(tmp);
            }
        }

    }
}
