package com.ji.algo.L1751_1800;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * user ji
 * data 2021/3/20
 * time 12:38 下午
 */
public class L1792 {
    public static void main(String[] args) {

    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int len = classes.length;
        //以差值为优先权构建一个最大优先队列
        Queue<double[]> cls = new PriorityQueue<>(
                Comparator.comparingDouble(a -> (a[0] - a[1]) / (a[1] * (a[1] + 1))));
        //向其中加入数据，int[]转换为double[]提高精度
        for (int i = 0; i < len; i++) {
            cls.offer(new double[]{classes[i][0], classes[i][1]});
        }
        //加入新学生
        while (extraStudents --> 0) {
            double[] temp = cls.poll();
            temp[0]++;
            temp[1]++;
            cls.offer(temp);
        }
        //计算结果
        double res = 0;
        while (cls.size() > 0) {
            double[] temp = cls.poll();
            res += temp[0] / temp[1];
        }
        return res / len;

    }
}
