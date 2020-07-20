package com.ji.algo.G0712;

import java.util.*;

/**
 * user ji
 * data 2020/7/12
 * time 10:29 上午
 */
public class G3 {
    public static void main(String[] args) {
        double a1[] = {0.5, 0.5, 0.2};
        int arr[][] = {{0, 1}, {1, 2}, {0, 2}};
//        System.out.println(maxProbability(3, arr, a1, 0, 2));
    }


    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        PriorityQueue<MyNode> que = new PriorityQueue<>((a, b) -> {return Double.compare(b.p, a.p);});//优先队列（这里是最大堆，一般最短路是最小堆）
        boolean vis [] = new boolean[n];//访问标记
        LinkedList<MyNode>lists []= new LinkedList[n];
        for(int i = 0;i < n; i++)lists[i] = new LinkedList<>();
        que.add(new MyNode(start, 1));
        for(int i=0;i<edges.length;i++) {//存成邻接表
            lists[edges[i][0]].add(new MyNode(edges[i][1], succProb[i]));
            lists[edges[i][1]].add(new MyNode(edges[i][0],succProb[i]));
        }
        double p[] = new double [n];
        p[start] = 1.0;
        while(!que.isEmpty()) {
            MyNode node = que.poll();
            if (vis[node.num])continue;
            if (node.num == end) return node.p;//找到答案了
            vis[node.num]  =true;
            for (MyNode tmp : lists[node.num]) {
                if(vis[tmp.num])continue;
                if(p[tmp.num] < p[node.num] * tmp.p) {//松弛操作
                    p[tmp.num] = p[node.num] * tmp.p;
                    que.add(new MyNode(tmp.num, p[tmp.num]));
                }
            }
        }
        return 0;//无法到达end节点
    }
    class MyNode {
        public int num;
        public double p;
        public MyNode() {}
        public MyNode(int num, double p) {
            this.num = num;
            this.p = p;
        }
    }
}
