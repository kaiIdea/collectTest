package com.company.collect.map;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: GEEX1428
 * @Date: 2021/5/26 14:46
 * @Description:
 */
public class HashMap1<K,V> extends AbstractMap<K,V> implements Map<K,V>,Cloneable, Serializable {


    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
