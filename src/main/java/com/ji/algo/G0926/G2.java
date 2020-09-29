package com.ji.algo.G0926;


/**
 * user ji
 * data 2020/9/26
 * time 10:18 上午
 */
public class G2 {
    public static void main(String[] args) {
        System.out.println(new G2().compute_Entropy("AABB"));
    }

    public float compute_Entropy(String content) {
        int arr[] = new int[4];
        for (int i = 0; i < content.length(); i++) {
            arr[content.charAt(i) - 'A'] += 1;
        }
        float res = 0;
        for (int i = 0; i < 4; i++) {
            double tmp = arr[i] * 1.0 / content.length();
            if (tmp == 0)
                continue;
            res += (tmp) * log2(tmp);
        }
        return (float) (Math.round(-res * 100) / 100);
    }
    // 功能函数，计算log2N
    public double log2(double m) {
        double n = 2;//底数
        return (Math.log(m) / Math.log(n));
    }
}
