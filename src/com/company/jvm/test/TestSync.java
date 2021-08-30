package com.company.jvm.test;

/**
 * @Auther: GEEX1428
 * @Date: 2021/8/17 13:49
 * @Description:
 */
public class TestSync {

    private int i;

    void onlyMe(Object object){
        synchronized (object){
            i = 1;
            System.out.println("i="+i);
        }
    }

    public static void main(String[] args) {
        new TestSync().onlyMe(new Object());
    }
}
