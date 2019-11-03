package com.ji.algo.L1027;/*
    user ji
    data 2019/10/27
    time 10:30 AM
*/

import java.util.ArrayList;
import java.util.List;

public class G1 {
    public static void main(String[] args) {

    }
    class CustomFunction{
        public int f(int x,int y){
            return 0;
        }
    }

    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (customfunction.f(i, 1) > z)
                break;
            for (int j = 1; j < Integer.MAX_VALUE; j++) {
                if (customfunction.f(i, j) == z) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(i);
                    tmp.add(j);
                    list.add(tmp);

                    break;
                }
                if (customfunction.f(i, j) > z) {
                    break;
                }
            }
        }
        return list;
    }

}
