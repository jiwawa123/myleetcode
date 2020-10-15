package com.ji.algo.G1015DX;

public class G2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8888; i++) {
            String a = "" + i;
            String b = "" + (8888 - i);
            while (a.length() < 4) {
                a = "0" + a;
            }
            while (b.length() < 4) {
                b = "0" + b;
            }
            if (isMatch(a, b)) {
                for (int j = 0; j < a.length(); j++) {
                    System.out.print(a.charAt(j));
                    if (j != 3)
                        System.out.print("");
                }
                System.out.println();
            }

        }
    }

    public static boolean isMatch(String a, String b) {
        return a.charAt(0) == b.charAt(3)
                && a.charAt(1) == b.charAt(0)
                && a.charAt(2) == b.charAt(1)
                && a.charAt(3) == b.charAt(2);
    }
}
