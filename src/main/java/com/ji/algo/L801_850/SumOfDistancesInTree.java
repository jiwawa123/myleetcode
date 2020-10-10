package com.ji.algo.L801_850;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * user ji
 * data 2020/10/6
 * time 8:40 上午
 */
public class SumOfDistancesInTree {
    public static void main(String[] args) {

    }
    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        int[] result = new int[N];
        ArrayList<Node> nodeList = new ArrayList<Node>(N);
        for (int i = 0; i < N; i++) {
            nodeList.add(new Node(i));
        }
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            Node nodeA = nodeList.get(a);
            Node nodeB = nodeList.get(b);
            nodeA.link(nodeB);
        }


        Node root = nodeList.get(0);
        root.traverse();
        root.initiate();
        root.totalDistance = root.subDistance;
        root.calculateDistance(N);
        for (int i = 0; i < N; i++) {
            result[i] = nodeList.get(i).totalDistance;
        }


        return result;
    }

    class Node {
        int val;
        Node parent;
        List<Node> nodes;
        int size;
        boolean visited;
        int subDistance;
        int totalDistance;
        public Node(int val) {
            this.val = val;
            this.parent = null;
            this.nodes = new ArrayList<Node>();
            this.size = 1;
            this.visited = false;
            this.subDistance = 0;
            this.totalDistance = 0;
        }

        public void link(Node anotherNode) {
            this.nodes.add(anotherNode);
            anotherNode.nodes.add(this);
        }

        public void traverse() {
            // System.out.println("A");
            for (Node node: nodes) {
                node.parent = this;
                node.nodes.remove(this);
                node.traverse();
            }
        }

        public void initiate() {
            for (Node node: nodes) {
                node.initiate();
                this.size += node.size;
                this.subDistance += node.subDistance;
                this.subDistance += node.size;
            }
        }

        public void calculateDistance(int N) {
            for (Node node: nodes) {
                node.totalDistance = this.totalDistance + N - node.size * 2;
                node.calculateDistance(N);
            }
        }

    }
}
