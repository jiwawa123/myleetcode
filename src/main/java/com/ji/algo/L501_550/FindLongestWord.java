package com.ji.algo.L501_550;/*
    user ji
    data 2019/7/16
    time 8:15 PM
*/

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindLongestWord {
    public static void main(String[] args) {
        String tmp = "abc";
        String arr[] = {"a","b","c"};
        String all = "wsmzffsupzgauxwokahurhhikapmqitytvcgrfpavbxbmmzdhnrazartkzrnsmoovmiofmilihynvqlmwcihkfskwozyjlnpkgdkayioieztjswgwckmuqnhbvsfoevdynyejihombjppgdgjbqtlauoapqldkuhfbynopisrjsdelsfspzcknfwuwdcgnaxpevwodoegzeisyrlrfqqavfziermslnlclbaejzqglzjzmuprpksjpqgnohjjrpdlofruutojzfmianxsbzfeuabhgeflyhjnyugcnhteicsvjajludwizklkkosrpvhhrgkzctzwcghpxnbsmkxfydkvfevyewqnzniofhsriadsoxjmsswgpiabcbpdjjuffnbvoiwotrbvylmnryckpnyemzkiofwdnpnbhkapsktrkkkakxetvdpfkdlwqhfjyhvlxgywavtmezbgpobhikrnebmevthlzgajyrmnbougmrirsxi";
        String t = "jpthiudqzzeugzwwsngebdeai";
        String k = "nbmxgkduynigvzuyblwjepn";
        System.out.println(match(all,t));
        System.out.println(match(all,k));
    }
    public String findLongestWord(String s, List<String> d) {
        Collections.sort(d, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()!=o2.length()){
                    return o2.length() - o1.length();
                }
                return o1.compareTo(o2);
            }
        });
        for (int i = 0; i < d.size(); i++) {
            if (match(s, d.get(i)))
                return d.get(i);
        }
        return "";
    }

    static boolean match(String a,String b){
        int p=0;
        for(int i=0;i<a.length()&&p<b.length();i++){
            //b中字符在a中相对位置不变
            if(a.charAt(i)==b.charAt(p)) p++;
        }
        if(p==b.length()) return true;
        return false;
    }
}
