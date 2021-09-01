package com.company.jvm.test3;

/**
 * @Auther: YangKai
 * @Date: 2021/8/29 14:51
 * @Description:
 */
public class TestClass3 {

    private String text2 = new String("Hello World");
    private String text = "Hello";
    private String text1 = "World";
    private String text3 = "Hello World";

    private final String text4 = "Hello World";


    public void test(){
        System.out.println(text2 == text3);


        System.out.println(text3 == text4);
        System.out.println(text2 == text4);
    }

    public static void main(String[] args) {
        new TestClass3().test();
    }

}
