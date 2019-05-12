package com.ji.algo.L601_650;/*
    user ji
    data 2019/5/12
    time 1:55 PM
*/

import java.util.List;

public class ReplaceWords {
    public static void main(String[] args) {

    }
    public String replaceWords(List<String> dict, String sentence) {
        dict.sort((a,b)->a.length() - b.length());
        String tmp[] = sentence.split(" ");
        StringBuffer sp = new StringBuffer();
        for (int i = 0; i < tmp.length; i++) {
            String k = tmp[i];
            for (int j = 0; j < dict.size(); j++) {
                if(k.length()<dict.get(j).length())
                    break;
                if(k.startsWith(dict.get(j))){
                    k = dict.get(j);
                    break;
                }
            }
            sp.append(k);
            sp.append(" ");
        }
        return sp.toString().trim();
    }
}
