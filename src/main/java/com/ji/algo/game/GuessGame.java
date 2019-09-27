package com.ji.algo.game;/*
    user ji
    data 2019/9/27
    time 9:02 AM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuessGame {
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            count += (guess[i] ^ answer[i]) == 0 ? 1 : 0;
        }
        return count;
    }

    public static int[] fraction(int[] cont) {
        int tmp[] = new int[2];
        if (cont.length == 1) {
            tmp[0] = cont[0];
            tmp[1] = 1;
            return tmp;
        }
        boolean flag = true;
        for (int i = cont.length - 1; i > 0; i--) {
            if (flag) {
                if (tmp[0] == tmp[1] && tmp[0] == 0) {
                    tmp[0] = 1;
                    tmp[1] = cont[i];
                } else {
                    int t = tmp[0];
                    tmp[0] = tmp[1];
                    tmp[1] = t;
                }
                flag = false;
            } else {
                tmp[0] += cont[i] * tmp[1];
                int t = tmp[0];
                tmp[0] = tmp[1];
                tmp[1] = t;
            }
        }
//        if (flag) {
//            int t = tmp[0];
//            tmp[0] = tmp[1];
//            tmp[1] = t;
//        }
        tmp[0] += cont[0] * tmp[1];
        int t = getGcc(tmp[0], tmp[1]);
        tmp[0] /= t;
        tmp[1] /= t;
        return tmp;
    }

    public static int getGcc(int a, int b) {
        if (b == 0)
            return a;
        return getGcc(b, a % b);
    }

    public static void main(String[] args) {
        int arr[] = {0, 0, 3};
        System.out.println(Arrays.toString(fraction(arr)));
    }
}
