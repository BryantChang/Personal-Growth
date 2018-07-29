package com.bryantchang.staticblock;

class MyClass {
    static {
        System.out.println("static code block");
    }
    public MyClass() {
        System.out.println("constructor invoked");
    }
}

public class AnotherTest {
    public static void main(String[] args) throws ClassNotFoundException{
        Class clz = Class.forName("com.bryantchang.staticblock.MyClass");
        Class[] clzs = {MyClass.class};

    }
}
