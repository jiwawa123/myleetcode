package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/18
    time 8:44 PM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trie {
    public static void main(String[] args) {

    }

    private int SIZE = 26;
    public TrieNode root;

    private class TrieNode{
        //private int num; // 多少个单词经过该节点
        private TrieNode[] son; // 子节点
        private char val;       // 单词的值
        private boolean isEnd;  // 是否是最后一个节点
        // 字典树节点
        TrieNode(char v){
            this.val = v;
            son = new TrieNode[SIZE];
            // num = 1;
            isEnd = false;
        }
    }

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode(' ');
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word == null || word.length() == 0) return;
        TrieNode node = root;
        char[] letters = word.toCharArray();
        for(int i=0,len=letters.length;i<len;i++){
            int pos = letters[i] - 'a';
            if(node.son[pos] == null){
                node.son[pos] = new TrieNode(letters[i]);
            }
            node = node.son[pos];
        }
        node.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word == null || word.length() == 0) return true;
        TrieNode node = root;
        char[] letters = word.toCharArray();
        for(int i=0,len=letters.length;i<len;i++){
            int pos = letters[i] - 'a';
            if(node.son[pos] == null) return false;
            node = node.son[pos];
        }
        return node.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(prefix == null || prefix.length() == 0) return true;
        TrieNode node = root;
        char[] letters = prefix.toCharArray();
        for(int i=0,len=letters.length;i<len;i++){
            int pos = letters[i] - 'a';
            if(node.son[pos] == null) return false;
            node = node.son[pos];
        }
        return true;
    }
}
