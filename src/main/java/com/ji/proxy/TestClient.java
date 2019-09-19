package com.ji.proxy;/*
    user ji
    data 2019/9/19
    time 10:20 AM
*/

public class TestClient {
    public static void main(String[] args) {
        System.out.println("**********************JDKProxy**********************");
        UserPorxy jdkPrpxy = new UserPorxy();
        User userManagerJDK = (User) jdkPrpxy.newProxy(new UserImp());
        userManagerJDK.addUser();

        System.out.println("cglib=================");
        CGLibProxy cgLibProxy = new CGLibProxy();
        User userCglib = (User) cgLibProxy.createProxyObject(new UserImp());
        userCglib.addUser();
    }
}
