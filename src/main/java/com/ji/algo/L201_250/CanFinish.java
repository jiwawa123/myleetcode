package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/18
    time 9:34 PM
*/

public class CanFinish {
    public static void main(String[] args) {

    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || prerequisites.length <= 1)
            return true;
        int finish = 0;
        for (int i = 0; i < prerequisites.length; i++) {

        }
        return finish == numCourses;
    }
    

}
