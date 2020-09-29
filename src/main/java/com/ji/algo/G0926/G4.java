package com.ji.algo.G0926;

/**
 * user ji
 * data 2020/9/26
 * time 3:30 下午
 */
public class G4 {
    public static void main(String[] args) {
        System.out.println(new G4().compute_exp("2&4"));
    }

    public int compute_exp(String exp) {
        if (exp.contains("@")) {
            return containsI(exp);
        } else {
            return containsII(exp);
        }
    }

    public int containsI(String exp) {
        String tmp[] = exp.split("@");
        int a = Integer.valueOf(tmp[0]);
        int b = Integer.valueOf(tmp[1]);
        return a * 3 + b;
    }

    public int containsII(String exp) {
        String tmp[] = exp.split("&");
        int a = Integer.valueOf(tmp[0]);
        int b = Integer.valueOf(tmp[1]);
        return a * a * b;
    }
}
