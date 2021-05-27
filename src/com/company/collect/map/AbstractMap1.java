package com.company.collect.map;

import java.util.Iterator;
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

    public boolean containsKey(Object key){
        Iterator<Entry1<K,V>> iterator = entrySet().iterator();
        if(null == key){
            while (iterator.hasNext()){
                Entry1<K,V> entry1 = iterator.next();
                if(null == entry1.getKey()){
                    return true;
                }
            }
        }else {
            while (iterator.hasNext()){
                Entry1<K,V> entry1 = iterator.next();
                if(key.equals(entry1.getKey())){
                    return true;
                }
            }
        }
        return false;
    }

    public V getValue(Object key){
        Iterator<Entry1<K,V>> iterator = entrySet().iterator();
        if(null == key){
            while (iterator.hasNext()){
                Entry1<K,V> e = iterator.next();
                if(null == e.getKey()){
                    return e.getValue();
                }
            }
        }else {
            while (iterator.hasNext()){
                Entry1<K,V> e = iterator.next();
                if(key.equals(e.getKey())){
                    return e.getValue();
                }
            }
        }
        return null;
    }

    public V put(K key, V value) {
        throw new UnsupportedOperationException("");
    }
}
