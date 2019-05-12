package com.ji.algo.L651_700;/*
    user ji
    data 2019/5/12
    time 2:06 PM
*/

public class BinarySubStrings {
    public static void main(String[] args) {
        System.out.println(new BinarySubStrings().countBinarySubstrings("00110011"));
    }

    public int countBinarySubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuffer sp = new StringBuffer();
            sp.append(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                sp.append(s.charAt(j));
                if(sp.length()%2==0){
                    if(isValid(sp.toString())){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public boolean isValid(String string) {
        String tmp = string.substring(0, string.length() / 2);
        String tmp1 = string.substring(string.length() / 2, string.length());
        if (!tmp.contains("1") && !tmp1.contains("0")) {
            return true;
        }
        if (!tmp.contains("0") && !tmp1.contains("1")) {
            return true;
        }
        return false;
    }


}
