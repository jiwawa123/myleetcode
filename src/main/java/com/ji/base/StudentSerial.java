package com.ji.base;/*
    user ji
    data 2019/5/9
    time 4:31 PM
*/

import java.io.*;

public class StudentSerial implements Serializable {
    public int age;
    public String name;

    public StudentSerial(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentSerial{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        try {
            //将一个序列化的对象写入文件
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/ji/Documents/java_data/object.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            StudentSerial student = new StudentSerial(12, "xiaoming");
            objectOutputStream.writeObject(student);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
            //将一个序列化的对象从文件中读出
            FileInputStream fileInputStream =
                    new FileInputStream("/Users/ji/Documents/java_data/object.dat");
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(fileInputStream);
            StudentSerial studentSerial = (StudentSerial) objectInputStream.readObject();
            System.out.println(studentSerial);
            System.out.println(studentSerial.age);
            System.out.println(studentSerial.name);
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
