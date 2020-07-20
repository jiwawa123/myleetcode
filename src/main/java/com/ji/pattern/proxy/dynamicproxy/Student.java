package com.ji.pattern.proxy.dynamicproxy;

/**
 * user ji
 * data 2020/7/19
 * time 2:02 下午
 */
public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Student() {
    }




    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
