package com.bryantchang.staticblock;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestStaticBlock {

    static {
        System.out.println("static code block");
    }
    private static final Logger logger = LogManager.getLogger(TestStaticBlock.class);

    public TestStaticBlock() {
        System.out.println("construction method");
    }

    public static void main(String[] args) {
        TestStaticBlock obj = new TestStaticBlock();
        System.out.println(TestStaticBlock.class.getClass().getName());
    }
}
