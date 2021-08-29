package com.company.jvm;

/**
 * @Auther: YangKai
 * @Date: 2021/8/29 22:40
 * @Description:
 */
public class NotInitialization {

    public static void main(String[] args) {
        //System.out.println(SuperClass.value);
        SuperClass[] sca = new SuperClass[10];
    }
}
