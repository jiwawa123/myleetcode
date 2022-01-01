package com.ji.algo.L2101_2150;

/**
 * @author ji
 * @data 2021/12/31
 * @time 8:32 下午
 */
public class L2120 {
    public static void main(String[] args) {
        int[] star = {0,1};
        executeInstructions(3,star,"RRDDLU");
    }

    public static int[] executeInstructions(int n, int[] startPos, String s) {
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int y = startPos[0];
            int x = startPos[1];
            int t = 0;
            for (int j = i; j < s.length(); j++) {
                boolean flag = true;
                switch (s.charAt(j)) {
                    case 'R':
                        if (x + 1 >= n) {
                            flag = false;
                        } else {
                            x++;
                        }
                        break;
                    case 'L':
                        if (x - 1 <0) {
                            flag = false;
                        } else {
                            x--;
                        }
                        break;
                    case 'U':
                        if (y - 1 > 0) {
                            flag = false;
                        } else {
                            y++;
                        }
                        break;
                    case 'D':
                        if (y - 1 < n - 1) {
                            flag = false;
                        } else {
                            y--;
                        }
                        break;
                }
                if (flag) {
                    t++;
                } else {
                    break;
                }
            }
            arr[i] = t;
        }


        return arr;
    }
}
