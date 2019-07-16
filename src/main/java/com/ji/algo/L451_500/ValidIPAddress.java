package com.ji.algo.L451_500;/*
    user ji
    data 2019/7/16
    time 11:17 AM
*/

public class ValidIPAddress {
    public static void main(String[] args) {

        System.out.println(new ValidIPAddress().isIPv4("172.16.254.1"));
    }

    public String validIPAddress(String IP) {
        String res1 = "Neither";
        String res2 = "IPv4";
        String res3 = "IPv6";
        if (IP == null || IP.length() == 0)
            return res1;
        if (IP.charAt(IP.length() - 1) == '.' || IP.charAt(IP.length() - 1) == ':')
            return res1;
        if (IP.contains(".")) {
            if (isIPv4(IP))
                return res2;
            return res1;
        } else if (IP.contains(":")) {
            if (isIPv6(IP))
                return res3;
            return res1;
        } else {
            return res1;
        }
    }

    public boolean isIPv4(String IP) {
        String tmp[] = IP.split("\\.");
        if (tmp.length != 4)
            return false;
        for (int i = 0; i < tmp.length; i++) {
            String add = tmp[i];
            if (add.length() > 3 || add.length() == 0)
                return false;
            if (add.charAt(0) == '0' && add.length() > 1)
                return false;
            int sum = 0;
            for (int j = 0; j < add.length(); j++) {
                if (add.charAt(i) >= '0' && add.charAt(i) <= '9')
                    sum = sum * 10 + (add.charAt(j) - '0');
                else
                    return false;
            }
            if (sum > 255)
                return false;
        }
        return true;
    }

    public boolean isIPv6(String IP) {
        String tmp[] = IP.split("\\:");
        if (tmp.length != 8)
            return false;
        for (int i = 0; i < tmp.length; i++) {
            String add = tmp[i];
            for (int j = 0; j < add.length(); j++) {
                if (add.charAt(j) < '0' || add.charAt(i) > 'f') return false;
                else if (add.charAt(i) > '9' && add.charAt(i) < 'A') return false;
                else if (add.charAt(i) > 'F' && add.charAt(i) < 'a') return false;
            }
        }
        return true;
    }
}
