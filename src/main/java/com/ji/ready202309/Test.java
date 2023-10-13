package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/14/23:09
 */
public class Test {
    public static Test test = new Test();
    public static int a;
    public static int b = 3;

    Test() {
        a++;
        b++;
    }

    public static void main(String[] args) {
        System.out.println(Test.a);
        System.out.println(Test.b);

        String str1 = "abc";
        String str2 = "ab";
        String str3 = str2 + "c";
        String str4 = "a" + "b" + "c";
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str1.equals(str3));
    }
}
