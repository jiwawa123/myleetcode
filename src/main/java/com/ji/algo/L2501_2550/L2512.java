package com.ji.algo.L2501_2550;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/02/21:17
 */
public class L2512 {
    public static void main(String[] args) {
        String[] p = {"yewmhbgnq", "vqhhuaejqw"};
        String[] n = {"zjeyq", "oyuetqe", "ks", "vuvannpwa", "qfd", "xv", "aauvtxrdt", "gml", "eaky", "mwip"};
        String[] report = {"lqiuderzod mwip vqhhuaejqw xrn aqjzkqjsi riuood yewmhbgnq xv nmcvqm onhkkmy", "uccz yewmhbgnq rcxdaqicbe vqhhuaejqw yewmhbgnq e vqhhuaejqw b yewmhbgnq vqhhuaejqw", "eaky yewmhbgnq eaky dwdzl yewmhbgnq yewmhbgnq ntqpnqtmnb qfd ks gvumi", "ecutvv vqhhuaejqw vqhhuaejqw inu vqhhuaejqw vqhhuaejqw uu eodzum zjeyq fxebx",
                "vqhhuaejqw m vuvannpwa mwip atvjp vqhhuaejqw eaky yewmhbgnq vqhhuaejqw yewmhbgnq"};
        int[] students = {581094748, 245764367, 905556075, 127263030, 415068015};
        L2512 l2512 = new L2512();
        l2512.topStudents(p, n, report, students, 4);
    }

    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        List<Node> list = new ArrayList<>();
        Set<String> positive = new HashSet<>();
        Set<String> negative = new HashSet<>();
        for (String str : positive_feedback
        ) {
            positive.add(str);
        }
        for (String str : negative_feedback
        ) {
            negative.add(str);
        }

        for (int i = 0; i < report.length; i++) {
            String[] re = report[i].split(" ");
            int sum = 0;
            for (int j = 0; j < re.length; j++) {
                if (positive.contains(re[j])) {
                    sum += 3;
                }
                if (negative.contains(re[j])) {
                    sum--;
                }
            }
            list.add(new Node(student_id[i], sum));

        }
        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.sum == o2.sum) {
                    return o1.index - o2.index;
                }
                return o2.sum - o1.sum;
            }
        });
        List<Integer> l = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            l.add(list.get(i).index);
        }

        return l;
    }
}

class Node {
    int index;
    int sum;

    public Node(int index, int sum) {
        this.index = index;
        this.sum = sum;
    }
}
