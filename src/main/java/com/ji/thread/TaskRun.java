package com.ji.thread;/*
    user ji
    data 2019/5/9
    time 8:54 AM
*/

public class TaskRun implements Runnable {
    public Task task;

    public TaskRun(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        
    }
}
