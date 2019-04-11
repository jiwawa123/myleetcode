package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/11
    time 9:26 AM
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IpAddress {
    public static void main(String[] args) {
        List<String> strings = new IpAddress().restoreIpAddresses("010010");
        strings.stream().forEach(System.out::println);
    }

    Set<List<String>> list = new HashSet<>();

    public List<String> restoreIpAddresses(String s) {
        List<String> re = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12)
            return re;
        List<String> tp = new ArrayList<>();
        help(tp, "", 0, s);
        List<List<String>> listI = new ArrayList<>(list);
        for (int i = 0; i < listI.size(); i++) {
            List<String> tmp = listI.get(i);
            StringBuffer sp = new StringBuffer();
            for (int j = 0; j < tmp.size(); j++) {
                sp.append(tmp.get(j));
                if (j != tmp.size() - 1)
                    sp.append(".");
            }
            re.add(sp.toString());
        }
        return re;
    }

    public void help(List<String> tmp, String t, int len, String s) {
        if (tmp.size() > 4)
            return;
        if (tmp.size() == 4) {
            if (len == s.length()) {
                list.add(new ArrayList<>(tmp));
            }
            return;
        }
        for (int i = len; i < s.length(); i++) {
            t += s.charAt(i);
            if (t.length() > 3 || Integer.valueOf(t) > 255) {
                break;
            }
            if(t.length()>1&&t.charAt(0)=='0')
                break;
            tmp.add(""+Integer.valueOf(t));
            help(tmp, "", i + 1, s);
            tmp.remove(tmp.size() - 1);
        }
    }
}
