package com.company.collect.map;

import java.util.Set;

/**
 * @Auther: GEEX1428
 * @Date: 2021/5/27 10:48
 * @Description:
 */
public abstract class AbstractMap1<K,V> implements Map1<K,V> {

    public abstract Set<Entry1<K,V>> entrySet();

    public int size() {
        return entrySet().size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}
