package com.ji.algo.Util;/*
    user ji
    data 2019/4/17
    time 7:24 PM
*/
/*
工具类，在TreeNode的基础上面添加了next指针，指向下一个
 */
public class TreeLinkNode {
    public int val;
    public TreeLinkNode left, right, next;

    TreeLinkNode(int x) {
        val = x;
    }
}
