package com.ji.algo.L1101_1150;/*
    user ji
    data 2019/9/3
    time 10:28 AM
*/

public class RemoveVowels {
    public static void main(String[] args) {

    }

    public String removeVowels(String tmp) {
        if(tmp==null||tmp.length()==0)
            return tmp;
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < tmp.length(); i++) {
            switch (tmp.charAt(i)) {
                case 'a':
                    break;
                case 'e':
                    break;
                case 'i':
                    break;
                case 'o':
                    break;
                case 'u':
                    break;
                default:
                    sp.append(tmp.charAt(i));
                    break;
            }
        }
        return sp.toString();
    }

}
