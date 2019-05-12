package com.ji.algo.Util;/*
    user ji
    data 2019/5/12
    time 9:12 AM
*/

import java.util.List;

public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
