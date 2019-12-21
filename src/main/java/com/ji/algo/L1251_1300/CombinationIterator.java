package com.ji.algo.L1251_1300;/*
    user ji
    data 2019/12/19
    time 11:09 PM
*/


import java.util.ArrayList;
import java.util.List;

public class CombinationIterator {
    private int combinationLength;
    private String  characters;
    private List<List<Character>> res = new ArrayList<>();
    private int index;

    //先选定前置位 在依次选定后置位 全排列问题
    public CombinationIterator(String characters, int combinationLength) {
        this.characters = characters;
        this.combinationLength = combinationLength;
        backtrace(new ArrayList<>(), 0);
    }

    private void backtrace(List<Character> list, int index) {
        if (list.size() == combinationLength) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < characters.length(); i++) {
            //从index开始 依次往后添加元素
            list.add(characters.charAt(i));
            //回溯下一个位置
            backtrace(list, i + 1);
            //移除最后一个位置 寻找当前节点的下一种可能
            list.remove(list.size() - 1);
        }
    }

    //使用全局变量index开始遍历整个集合
    public String next() {
        StringBuilder sb = new StringBuilder();
        for (char c : res.get(index)) {
            sb.append(c);
        }
        index++;
        return sb.toString();
    }

    //题目保证有解 不需要判断index范围
    public boolean hasNext() {
        return index < res.size();
    }
}
