package com.ji.ready202309;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/08/22:52
 */
public class L93 {
    public static void main(String[] args) {

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
