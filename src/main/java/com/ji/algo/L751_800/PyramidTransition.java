package com.ji.algo.L751_800;/*
    user ji
    data 2019/7/26
    time 1:46 PM
*/

import java.util.*;

public class PyramidTransition {
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
        System.out.println(new PyramidTransition().pyramidTransition(tt, list));
        System.out.println(System.currentTimeMillis() - a);
    }


    private Map<String, List<Character>> map;

    public boolean pyramidTransition(String bottom, List<String> allowed) {
        /**
         直接暴力搜索的dfs会超时, 要利用一个map保存所有方块可能的顶部字母
         **/
        map = new HashMap<>();
        for(String brick : allowed) {
            String base = brick.substring(0, 2);
            if(!map.containsKey(base))
                map.put(base, new ArrayList<>());
            map.get(base).add(brick.charAt(2));
        }
        return dfs(bottom);
    }

    private boolean dfs(String bottom) {
        // bottom为1说明到达金字塔顶端, 可以搭成金字塔
        if(bottom.length() == 1) return true;
        // 如果bottom中有未出现过的方块底层说明不能搭成金字塔
        for(int i = 0; i < bottom.length()-1; ++i)
            if(!map.containsKey(bottom.substring(i,i+2)))
                return false;
        // 根据bottom生成所有可能的上层方块
        List<String> candidates = new ArrayList<>();
        generateUpper(bottom, candidates, new StringBuilder(), 0);
        for(String upper : candidates)
            if(dfs(upper))
                return true;
        return false;
    }

    private void generateUpper(String bottom, List<String> candidates, StringBuilder sb, int st) {
        if(st == bottom.length()-1) {
            candidates.add(sb.toString());
            return;
        }
        for(Character c : map.get(bottom.substring(st, st+2))) {
            sb.append(c);
            generateUpper(bottom, candidates, sb, st+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
