package com.ji.pattern.proxy.dynamicproxy;

/**
 * user ji
 * data 2020/7/19
 * time 1:42 下午
 */
public class Client {
    public static void main(String[] args) {
//        SubjectInvocationHandler subject = new SubjectInvocationHandler();
//        Hello hello = (Hello) subject.newProxyInstance(new HelloImp());
//        hello.help();
//        System.out.println("==========");
//        Yes yes = (Yes) subject.newProxyInstance(new YesImp());
//        yes.myPrint();

        CGLibProxy cgLibProxy = new CGLibProxy();
        Student student = (Student) cgLibProxy.createProxyObject(Student.class);
        System.out.println(student.toString());
    }
}
