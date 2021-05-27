package com.company.collect.map;

/**
 * @Auther: GEEX1428
 * @Date: 2021/5/27 13:45
 * @Description:
 */
public interface Entry1<K,V> {


    K getKey();

    V getValue();

    V setValue(V value);
}
