package com.ji.gc;/*
    user ji
    data 2019/5/16
    time 7:03 PM
*/

public class InitTest {
    private int age;
    private String name;
    private char c;
    private byte b;
    private boolean flag;

    @Override
    public String toString() {
        return "InitTest{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", c=" + c +
                ", b=" + b +
                ", flag=" + flag +
                '}';
    }

    public static void main(String[] args) {
        InitTest initTest = new InitTest();
        System.out.println(initTest.toString());
    }
}
