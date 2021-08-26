package com.company.collect.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: GEEX1428
 * @Date: 2021/6/1 10:40
 * @Description:
 */
public class Test1 {


    public static void main(String[] args) {
        HashMap1<String,Object> map = new HashMap1<>();
        map.put("13",12);
        map.put("12",12);
        map.put("12",12);

        //Map.Entry<String,Object>[] tab = (Map.Entry<String, Object>[]) map.getNodeArray();
        //System.out.println();
        //map.resize()


        DateFormate formate = new DateFormate();
        char[] chars = formate.compile("yyyyMMddHHmmss");
        System.out.printf("");
    }
}
