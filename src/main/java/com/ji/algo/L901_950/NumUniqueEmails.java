package com.ji.algo.L901_950;/*
    user ji
    data 2019/6/18
    time 9:01 AM
*/

import java.util.HashMap;
import java.util.Map;

public class NumUniqueEmails {
    public static void main(String[] args) {
        String arr[] ={"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
        System.out.println(numUniqueEmails(arr));
    }

    public static int numUniqueEmails(String[] emails) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < emails.length; i++) {
            String tmp = emails[i];
            String email[] = tmp.split("@");
            email[0] = email[0].replaceAll("\\.", "");
            if (email[0].contains("+")) {
                email[0] = email[0].split("\\+")[0];
            }
            map.put(email[0] +"@"+ email[1], 0);
        }
        return map.size();
    }
}
