package com.company.collect.map;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * @Auther: GEEX1428
 * @Date: 2021/5/26 14:46
 * @Description:
 */
public class HashMap1<K,V> extends AbstractMap1<K,V> implements Map1<K,V>,Cloneable, Serializable {

    private static StringBuffer stringBuffer = new StringBuffer();

    @Override
    public Set<Entry1<K, V>> entrySet() {
        return null;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public boolean containsKey(Object key) {
       return false;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }



    static class Node1<K,V> implements Entry1<K,V>{
        final K key;
        V value;
        Node1 next;
        final int hashCode;

        public Node1(K key, V value, Node1 next, int hashCode) {
            this.key = key;
            this.value = value;
            this.next = next;
            this.hashCode = hashCode;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = value;
            this.value = value;
            return oldValue;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == this){
                return true;
            }
            if(obj instanceof Entry1){
                Entry1<K,V> e = (Entry1<K, V>) obj;
                if(Objects.equals(key,e.getKey()) && Objects.equals(value,e.getValue())){
                    return true;
                }
            }
            return false;
        }
    }
//    static int hash(Object key){
//        int h;
//        return null == key?0:((h = key.hashCode()) ^ h >>>16);
//    }


    static int hash(Object key){
        int keyHash = key.hashCode(),h =  key.hashCode();
        h = h >>> 16;
        int result = keyHash ^ h;
        System.out.println(result);
        return null == key?0:((h = key.hashCode()) ^ h >>>16);
    }


    public static void main(String[] args) {
        int aa = hash("12");
        System.out.println();
    }
}
