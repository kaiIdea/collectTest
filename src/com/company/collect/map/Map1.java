package com.company.collect.map;

/**
 * @Auther: GEEX1428
 * @Date: 2021/5/27 10:48
 * @Description:
 */
public interface Map1<K,V> {

    int size();

    boolean isEmpty();

    V get(Object key);

    boolean containsKey(Object key);

    V put(K key,V value);
}
