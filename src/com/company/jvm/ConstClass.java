package com.company.jvm;

/**
 * @Auther: GEEX1428
 * @Date: 2021/8/30 10:35
 * @Description:
 */
public class ConstClass {

    static {
        System.out.println("ConstClass init...");
    }

    public static final String HELLOWORLD = "hello world";
}
