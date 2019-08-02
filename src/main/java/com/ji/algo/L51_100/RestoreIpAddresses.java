package com.ji.algo.L51_100;/*
    user ji
    data 2019/8/2
    time 9:34 AM
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RestoreIpAddresses {
    public static void main(String[] args) {
        RestoreIpAddresses restoreIpAddresses = new RestoreIpAddresses();
        System.out.println(restoreIpAddresses.restoreIpAddresses("010010"));
    }

    Set<String> list;

    public List<String> restoreIpAddresses(String s) {
        list = new HashSet<>();
        help(s, "", 0, new ArrayList<>(), 0);
        return new ArrayList<>(list);
    }

    public void help(String s, String kk, int tmp, List<String> li, int index) {
        if (li.size() > 4)
            return;
        if (index == s.length() && li.size() == 4) {
            StringBuilder sp = new StringBuilder();
            for (int i = 0; i < li.size(); i++) {
                sp.append(li.get(i));
                if (li.get(i).length() > 1 && li.get(i).charAt(0) == '0')
                    return;
                if (i != li.size() - 1) {
                    sp.append(".");
                }
            }
            list.add(sp.toString());
            return;
        }
        for (int i = index; i < s.length(); i++) {
            int k = tmp;
            kk += s.charAt(i);
            tmp = tmp * 10 + (s.charAt(i) - '0');
            if (tmp <= 255 && tmp >= 0 && kk.length() > 0) {
                li.add(kk);
                help(s, "", 0, new ArrayList<>(li), i + 1);
                li.remove(li.size() - 1);
            } else {
                break;
            }
        }

    }
}
