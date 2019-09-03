package com.ji.algo.L451_500;/*
    user ji
    data 2019/9/3
    time 10:23 AM
*/

public class SolutionCycle {
    double x_center;
    double y_center;
    double radius;

    public SolutionCycle(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public double[] randPoint() {
        while(true){
            double x = Math.random()*radius*2-radius;
            double y = Math.random()*radius*2-radius;
            if(x*x+y*y<=radius*radius){
                return new double[]{x+x_center,y+y_center};
            }
        }
    }
}
