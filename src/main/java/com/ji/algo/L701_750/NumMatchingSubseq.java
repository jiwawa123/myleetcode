package com.ji.algo.L701_750;/*
    user ji
    data 2019/7/30
    time 4:58 PM
*/

import java.util.*;

public class NumMatchingSubseq {
    public static void main(String[] args) {

    }

    public int numMatchingSubseq(String S, String[] words) {
        List<Integer>[] book=new List[26];
        for (int i=0;i<26;i++)
        {
            book[i]=new ArrayList<>();
        }
        for (int i=0;i<S.length();i++)
        {
            book[S.charAt(i)-'a'].add(i);
        }
        int res=0;
        for (String s:words)
        {
            res+=check(s,book)?1:0;
        }
        return res;
    }

    private boolean check(String s, List<Integer>[] book) {
        int cur=-1;
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            List<Integer> list=book[c-'a'];
            int index=Collections.binarySearch(list,cur);
            index=index<0?-index-1:index+1;
            if(index>=list.size())return false;
            cur=list.get(index);
        }
        return true;
    }
}
