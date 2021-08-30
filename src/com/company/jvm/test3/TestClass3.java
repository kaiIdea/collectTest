package com.company.jvm.test3;

/**
 * @Auther: YangKai
 * @Date: 2021/8/29 14:51
 * @Description:
 */
public class TestClass3 {

    private String text2 = new String("Hello");
    private String text = "Hello";
    private String text1 = "World";


    public void test(){
        System.out.println(text2 == text);
    }

    public static void main(String[] args) {
        new TestClass3().test();
    }

}
