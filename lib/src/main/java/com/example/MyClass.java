package com.example;

public class MyClass {
    public static void main(String[] args) {
        DiffUtils.diff("old.apk","new.apk","1_2.patch");
        System.out.println("生成完毕");
    }
}
