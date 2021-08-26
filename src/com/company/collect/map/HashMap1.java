package com.company.collect.map;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


/**
 * @Auther: GEEX1428
 * @Date: 2021/5/26 14:46
 * @Description:
 */
public class HashMap1<K,V> extends AbstractMap1<K,V> implements Map1<K,V>,Cloneable, Serializable {

    private static StringBuffer stringBuffer = new StringBuffer();


    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16

    transient Node<K,V>[] table;

    int threshold;

    final float loadFactor = DEFAULT_LOAD_FACTOR;


    static final int MAXIMUM_CAPACITY = 1 << 30;

    /**
     * The load factor used when none specified in constructor.
     */
    static final float DEFAULT_LOAD_FACTOR = 0.75f;


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


//    HashMap1.Node<K,V> newNode(int hash, K key, V value, HashMap1.Node<K,V> next) {
//        return new HashMap1.Node<>(hash, key, value, next);
//    }

    @Override
    public V put(K key, V value) {
        Node<K,V>[] table = new Node[DEFAULT_INITIAL_CAPACITY];
        int hash = hash(key);
        int n = table.length -1 & hash;
        table[n] = newNode(hash,key,value,null);
        return value;
    }

    public Node<K,V>[] getNodeArray(){
        return table;
    }


//    final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
//                   boolean evict) {
//        Node<K,V>[] tab; Node<K,V> p; int n, i;
//        if ((tab = table) == null || (n = tab.length) == 0)
//            n = (tab = resize()).length;
//        if ((p = tab[i = (n - 1) & hash]) == null)
//            tab[i] = newNode(hash, key, value, null);
//        else {
//            Node<K,V> e; K k;
//            if (p.hashCode == hash &&
//                    ((k = p.key) == key || (key != null && key.equals(k))))
//                e = p;
//            else if (p instanceof TreeNode)
//                e = ((HashMap1.TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
//            else {
//                for (int binCount = 0; ; ++binCount) {
//                    if ((e = p.next) == null) {
//                        p.next = newNode(hash, key, value, null);
//                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
//                            treeifyBin(tab, hash);
//                        break;
//                    }
//                    if (e.hash == hash &&
//                            ((k = e.key) == key || (key != null && key.equals(k))))
//                        break;
//                    p = e;
//                }
//            }
//            if (e != null) { // existing mapping for key
//                V oldValue = e.value;
//                if (!onlyIfAbsent || oldValue == null)
//                    e.value = value;
//                afterNodeAccess(e);
//                return oldValue;
//            }
//        }
//        ++modCount;
//        if (++size > threshold)
//            resize();
//        afterNodeInsertion(evict);
//        return null;
//    }
    public Node<K,V> newNode(int hash,K k,V v,Node next){
        return new Node<>(k,v,next,hash);
    }


    static class Node<K,V> implements Entry1<K,V>{
        final K key;
        V value;
        Node next;
        final int hashCode;

        public Node(K key, V value, Node next, int hashCode) {
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

    static final class TreeNode<K,V> extends Node<K,V>{

        public TreeNode(K key, V value, Node next, int hashCode) {
            super(key, value, next, hashCode);
        }

        public void split(HashMap1<K, V> kvHashMap1, Node<K, V>[] newTab, int j, int oldCap) {
        }
    }


    final Node<K,V>[] resize(Node<K,V>[] table){
        Node<K,V>[] oldTab = table;
        int oldCap = (oldTab == null) ? 0 : oldTab.length;
        int oldThr = threshold;
        int newCap, newThr = 0;
        if (oldCap > 0) {
            if (oldCap >= MAXIMUM_CAPACITY) {
                threshold = Integer.MAX_VALUE;
                return oldTab;
            }
            else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
                    oldCap >= DEFAULT_INITIAL_CAPACITY)
                newThr = oldThr << 1; // double threshold
        }
        else if (oldThr > 0) // initial capacity was placed in threshold
            newCap = oldThr;
        else {               // zero initial threshold signifies using defaults
            newCap = DEFAULT_INITIAL_CAPACITY;
            newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
        }
        if (newThr == 0) {
            float ft = (float)newCap * loadFactor;
            newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
                    (int)ft : Integer.MAX_VALUE);
        }
        threshold = newThr;
        @SuppressWarnings({"rawtypes","unchecked"})
        Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];
        table = newTab;
        if (oldTab != null) {
            for (int j = 0; j < oldCap; ++j) {
                Node<K,V> e;
                if ((e = oldTab[j]) != null) {
                    oldTab[j] = null;
                    if (e.next == null)
                        newTab[e.hashCode & (newCap - 1)] = e;
                    else if (e instanceof TreeNode)
                        ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
                    else { // preserve order
                        Node<K,V> loHead = null, loTail = null;
                        Node<K,V> hiHead = null, hiTail = null;
                        Node<K,V> next;
                        do {
                            next = e.next;
                            if ((e.hashCode & oldCap) == 0) {
                                if (loTail == null)
                                    loHead = e;
                                else
                                    loTail.next = e;
                                loTail = e;
                            }
                            else {
                                if (hiTail == null)
                                    hiHead = e;
                                else
                                    hiTail.next = e;
                                hiTail = e;
                            }
                        } while ((e = next) != null);
                        if (loTail != null) {
                            loTail.next = null;
                            newTab[j] = loHead;
                        }
                        if (hiTail != null) {
                            hiTail.next = null;
                            newTab[j + oldCap] = hiHead;
                        }
                    }
                }
            }
        }
        return newTab;
    }


    public static void main(String[] args) {
        //int aa = hash("12");

        HashMap1 hashMap1 = new HashMap1();
        Map<String,Object> map = new HashMap<>();
        map.put("13",12);
        map.put("12",12);
        map.put("12",12);



        //0000000000001111   15
        //0110001000011111   1569
        System.out.println();
    }
}
